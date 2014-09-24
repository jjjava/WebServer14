package br.com.schumaker.io;

import br.com.schumaker.network.Addresses;
import br.com.schumaker.network.FolderNames;
import br.com.schumaker.template.IndexTemplate;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 * @version 1.1.2
 */
public class IndexWriter {

    public static void createIndexFile(String indexFileName) {
        File www = new File(Addresses.getWWWFolderPath());
        String[] allFileList = www.list();
        ArrayList<String> dirList = new ArrayList<>();
        for (String name : allFileList) {
            File file = new File(Addresses.getWWWFolderPath() + name);
            if (file.isDirectory()) {
                if (!file.getName().equalsIgnoreCase(FolderNames.getDefaultServerImagesFolderName())
                        && !file.getName().equalsIgnoreCase(FolderNames.getDefaultServerCssFolderName())
                        && !file.getName().equalsIgnoreCase(FolderNames.getDefaultServerJsFolderName())) {
                    dirList.add(file.getName());
                }
            }
        }
        String html2 = "";
        for (int k = 0; k < dirList.size(); k++) {
            html2 = html2 + " <li><a href=\"" + dirList.get(k) + "/" + indexFileName + "\" target=\"_blank\">" + dirList.get(k) + "</a></li>\n";
        }

        String page = IndexTemplate.getHtmlPart1() + html2 + IndexTemplate.getHtmlPart3();
        writeIndexFile(page, indexFileName);
    }

    public static void createIndexFile(String indexFileName, String companyName) {
        File www = new File(Addresses.getWWWFolderPath());
        String[] allFileList = www.list();
        ArrayList<String> dirList = new ArrayList<>();
        for (String name : allFileList) {
            File file = new File(Addresses.getWWWFolderPath() + name);
            if (file.isDirectory()) {
                if (!file.getName().equalsIgnoreCase(FolderNames.getDefaultServerImagesFolderName())
                        && !file.getName().equalsIgnoreCase(FolderNames.getDefaultServerCssFolderName())
                        && !file.getName().equalsIgnoreCase(FolderNames.getDefaultServerJsFolderName())) {
                    dirList.add(file.getName());
                }
            }
        }
        String html2 = "";
        for (int k = 0; k < dirList.size(); k++) {
            html2 = html2 + " <li><a href=\"" + dirList.get(k) + "/" + indexFileName + "\" target=\"_blank\">" + dirList.get(k) + "</a></li>\n";
        }

        String page = IndexTemplate.getHtmlPart1(companyName) + html2 + IndexTemplate.getHtmlPart3();
        writeIndexFile(page, indexFileName);
    }

    private static void writeIndexFile(String content, String indexFileName) {
        File file = new File(Addresses.getIndexServerFilePath());
        try {
            System.out.println("Criando arquivo " + indexFileName);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            buffer.write(content);
            buffer.flush();
            buffer.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("Arquivo " + indexFileName + " criado/atualizado");
    }
}
