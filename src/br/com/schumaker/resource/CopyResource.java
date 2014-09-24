package br.com.schumaker.resource;

import br.com.schumaker.io.IndexWriter;
import br.com.schumaker.network.Addresses;
import br.com.schumaker.network.FileNames;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Hudson Schumaker
 */
public class CopyResource {

    private String indexFileName;
    private String companyName;

    public CopyResource() {

    }

    public CopyResource(String indexFileName) {
        this.indexFileName = indexFileName;
    }

    public CopyResource(String indexFileName, String companyName) {
        this.indexFileName = indexFileName;
        this.companyName = companyName;
    }

    public void copyAllResources() {
        System.out.println(">Verificando recursos.");
        copyIndex();
        copyFavicon();
        copyCss();
        copyJs();
        copyBackground();
        copyHeader();
        copyFolder();
        copyFile();
        copy403();
        copy404();
        copy500();
        copy501();
        copyManual();
        System.out.println(">Recursos verificados.");
    }

    private void copyIndex() {
        IndexWriter.createIndexFile(indexFileName, companyName);
    }

    private void copyBackground() {
        try {
            File file = new File(Addresses.getBGServerFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.getBGFileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultServerBGFileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultServerBGFileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultServerBGFileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copyHeader() {
        try {
            File file = new File(Addresses.getHeaderServerFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.getHeaderFileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultServerHeaderFileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultServerHeaderFileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultServerHeaderFileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copyFolder() {
        try {
            File file = new File(Addresses.getFolderServerFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.getFolderFileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultFolderIconFileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultFolderIconFileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultFolderIconFileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copyFile() {
        try {
            File file = new File(Addresses.getFileServerFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.getFileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultFileIconFileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultFileIconFileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultFileIconFileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copyCss() {
        try {
            File file = new File(Addresses.getCssServerFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.getCssFileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultServerCssFileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultServerCssFileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultServerCssFileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copyJs() {
        try {
            File file = new File(Addresses.getJsServerFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.getJsFileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultServerJsFileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultServerJsFileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultServerJsFileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copy403() {
        try {
            File file = new File(Addresses.get403ErrorFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.get403FileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultServerErro403FileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultServerErro403FileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultServerErro403FileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copy404() {
        try {
            File file = new File(Addresses.get404ErrorFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.get404FileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultServerErro404FileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultServerErro404FileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultServerErro404FileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copy500() {
        try {
            File file = new File(Addresses.get500ErrorFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.get500FileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultServerErro500FileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultServerErro500FileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultServerErro500FileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copy501() {
        try {
            File file = new File(Addresses.get501ErrorFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.get501FileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDefaultServerErro501FileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDefaultServerErro501FileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDefaultServerErro501FileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copyFavicon() {
        try {
            File file = new File(Addresses.getFaviconFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.getFaviconFileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getDeafaultServerFaviconFileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getDeafaultServerFaviconFileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getDeafaultServerFaviconFileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private void copyManual() {
        try {
            File file = new File(Addresses.getManualFilePath());
            if (!file.exists()) {
                InputStream resource = getClass().getClassLoader().getResourceAsStream(ResourcesPaths.getManualFileResourcePath());
                if (resource == null) {
                    throw new IOException(" - Recurso nao encontrado: " + FileNames.getManualServerFileName());
                }
                BufferedInputStream input = new BufferedInputStream(resource);
                BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(file));
                byte[] buffer = new byte[1024];
                int length;
                while ((length = input.read(buffer)) > 0) {
                    output.write(buffer, 0, length);
                }
                output.close();
                input.close();
                System.out.println(" - " + FileNames.getManualServerFileName() + " criado.");
            } else {
                System.out.println(" - " + FileNames.getManualServerFileName() + " [OK].");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
