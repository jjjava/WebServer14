package br.com.schumaker.core;

import br.com.schumaker.network.Addresses;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;
import br.com.schumaker.util.Util;
import java.io.IOException;

/**
 *
 * @author Hudson Schumaker
 * @version 2014
 */
public class ThreadCore {

    public static ServerSocket listenSocket = null;
    public static Socket connectionSocket = null;

    public ThreadCore(int port, String indexFile) {
        try {
            System.out.println("> WebServer HStudio Black Edition <");
            System.out.println("> Verison: " + Util.getVersion() + "                  <");
            System.out.println("> Server running...               <");
            System.out.println("> Server listening on port: " + port + "    <");
            System.out.println("___________________________________");
            listenSocket = new ServerSocket(port);
        } catch (IOException e) {
            //  System.out.println(e);
        }
        while (true) {
            try {
                connectionSocket = listenSocket.accept();
                System.out.println("Client IP: " + connectionSocket.getInetAddress());
                new Session(connectionSocket, indexFile).start();
            } catch (IOException e) {

            }
        }
    }

    static class Session extends Thread {

        Socket socket = null;
        String indexFile = null;

        public Session(Socket socket, String indexFile) {
            this.setPriority(Thread.NORM_PRIORITY);
            this.socket = socket;
            this.indexFile = indexFile;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String requestMessageLine;
                    String fileName;

                    BufferedReader inFromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    DataOutputStream outToClient = new DataOutputStream(socket.getOutputStream());
                    requestMessageLine = inFromClient.readLine();

                    //System.out.println(requestMessageLine);
                    StringTokenizer tokenizedLine = new StringTokenizer(requestMessageLine);

                    if (tokenizedLine.nextToken().equals("GET")) {
                        fileName = tokenizedLine.nextToken();
                        if (fileName.equalsIgnoreCase("/")) {
                            fileName = indexFile;
                        } else if (fileName.startsWith("/")) {
                            fileName = fileName.substring(1);
                        }

                        fileName = fileName.replaceAll("%20", " ");//caralho!!!!!!
                        File file = new File(Addresses.getWWWFolderPath() + fileName);
                        if (file.exists()) {
                            if (file.isDirectory()) {
                                if (haveIndexFile(file)) {
                                    int numOfBytes = (int) file.length();
                                    FileInputStream inFile = new FileInputStream(Addresses.getWWWFolderPath() + fileName + "/" + indexFile);
                                    byte[] fileInBytes = new byte[numOfBytes];
                                    inFile.read(fileInBytes);
                                    outToClient.writeBytes("HTTP/1.0 200 Document Follows\r\n");

                                    if (MineType.getMineType(fileName) != null) {
                                        outToClient.writeBytes(MineType.getMineType(fileName));
                                    }

                                    outToClient.writeBytes("Content-Length: " + numOfBytes + "\r\n");
                                    outToClient.writeBytes("\r\n");
                                    outToClient.write(fileInBytes, 0, numOfBytes);
                                    socket.close();
                                } else {
                                    String html = folderNavigation(file);

                                    outToClient.writeBytes("HTTP/1.0 200 Document Follows\r\n");
                                    outToClient.writeBytes("Content-Type:text/html\r\n");
                                    outToClient.writeBytes("Content-Length: " + html.getBytes() + "\r\n");
                                    outToClient.writeBytes("\r\n");
                                    outToClient.write(html.getBytes());
                                    socket.close();
                                    return;
                                }

                            } else {
                                fileName = fileName.replaceAll("%20", " ");//caralho!!!!!
                                int numOfBytes = (int) file.length();
                                FileInputStream inFile = new FileInputStream(Addresses.getWWWFolderPath() + fileName);
                                // System.out.println("Address" + Addresses.getWWWFolderPath() + fileName);
                                byte[] fileInBytes = new byte[numOfBytes];
                                inFile.read(fileInBytes);
                                outToClient.writeBytes("HTTP/1.0 200 Document Follows\r\n");
                                if (MineType.getMineType(fileName) != null) {
                                    outToClient.writeBytes(MineType.getMineType(fileName));
                                }

                                outToClient.writeBytes("Content-Length: " + numOfBytes + "\r\n");
                                outToClient.writeBytes("\r\n");
                                outToClient.write(fileInBytes, 0, numOfBytes);
                                socket.close();
                            }
                        } else {
                            File ferror = new File(Addresses.get404ErrorFilePath());
                            int numOfBytes = (int) ferror.length();
                            FileInputStream inFile = new FileInputStream(Addresses.get404ErrorFilePath());
                            byte[] fileInBytes = new byte[numOfBytes];
                            inFile.read(fileInBytes);
                            outToClient.writeBytes("HTTP/1.0 200 Document Follows\r\n");

                            if (fileName.endsWith(".ico")) {
                                outToClient.writeBytes("Content-Type:image/ico\r\n");
                            }

                            outToClient.writeBytes("Content-Type:text/html\r\n");
                            outToClient.writeBytes("Content-Length: " + numOfBytes + "\r\n");
                            outToClient.writeBytes("\r\n");
                            outToClient.write(fileInBytes, 0, numOfBytes);
                            socket.close();
                        }
                    } else {
                        System.out.println("Bad Request Message");
                    }
                }
            } catch (IOException e) {

            }
        }

        private String folderNavigation(File folder) throws IOException {
            String folderName = folder.getName();
            String files[] = folder.list();
            String filesNames[] = folder.list();

            for (int k = 0; k < files.length; k++) {
                files[k] = files[k].replaceAll(" ", "%20");//caralho!!!!!
            }
            String html
                    = "<hmtl>"
                    + "<head>"
                    + "<title>" + folderName + "</title>"
                    + "</head>"
                    + "<body>"
                    + "<h2>/" + folder.getName() + "</h2>";
            String html2 = "";
            for (int k = 0; k < files.length; k++) {
                File file = new File(folder.getAbsoluteFile() + "/" + filesNames[k]);
                if (file.isFile()) {
                    html2 = html2 + "<img src=\"../images/docs_24.png\"> <a href=\"" + files[k] + "\">" + filesNames[k] + "</a></br>";
                } else {
                    html2 = html2 + "<img src=\"../images/foldr_24.png\"><a href=\"" + files[k] + "\">" + filesNames[k] + "</a></br>";
                }
            }
            String html3
                    = "</body>"
                    + "</html>";
            html = html + html2 + html3;
            return html;
        }

        public boolean haveIndexFile(File folder) {
            boolean exists = false;
            String filesNames[] = folder.list();

            for (int k = 0; k < filesNames.length; k++) {
                if (filesNames[k].equalsIgnoreCase(indexFile)) {
                    exists = true;
                    break;
                }
            }
            return exists;
        }
    }
}
