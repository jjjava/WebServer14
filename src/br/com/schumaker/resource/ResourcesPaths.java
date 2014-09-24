package br.com.schumaker.resource;

import br.com.schumaker.network.FileNames;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 */
public class ResourcesPaths {

    public static final String root = "br/com/schumaker/gfx/";

    public ResourcesPaths() {
        System.out.println("ResourcesPaths Library acessada.");
    }

    public static String getIndexFileResourcePath() {
        return root + FileNames.getDefaultServerIndexFileName();
    }

    public static String getBGFileResourcePath() {
        return root + FileNames.getDefaultServerBGFileName();
    }

    public static String getHeaderFileResourcePath() {
        return root + FileNames.getDefaultServerHeaderFileName();
    }

    public static String getFolderFileResourcePath() {
        return root + FileNames.getDefaultFolderIconFileName();
    }

    public static String getFileResourcePath() {
        return root + FileNames.getDefaultFileIconFileName();
    }

    public static String getCssFileResourcePath() {
        return root + FileNames.getDefaultServerCssFileName();
    }

    public static String getJsFileResourcePath() {
        return root + FileNames.getDefaultServerJsFileName();
    }

    public static String get403FileResourcePath() {
        return root + FileNames.getDefaultServerErro403FileName();
    }

    public static String get404FileResourcePath() {
        return root + FileNames.getDefaultServerErro404FileName();
    }

    public static String get500FileResourcePath() {
        return root + FileNames.getDefaultServerErro500FileName();
    }

    public static String get501FileResourcePath() {
        return root + FileNames.getDefaultServerErro501FileName();
    }

    public static String getFaviconFileResourcePath() {
        return root + FileNames.getDeafaultServerFaviconFileName();
    }

    public static String getManualFileResourcePath() {
        return root + FileNames.getManualServerFileName();
    }
}
