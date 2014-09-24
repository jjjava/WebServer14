package br.com.schumaker.network;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 */
public class FileNames {

    private static final String iniFileName = "www.ini";
    private static final String indexFileName = "index.html";
    private static final String headerFileName = "header.jpg";
    private static final String backgroundFileName = "body.jpg";
    private static final String folderIconFileName = "foldr_24.png";
    private static final String fileIconFileName = "docs_24.png";
    private static final String cssFileName = "style.css";
    private static final String jsFileName = "script.js";
    private static final String erro403FileName = "403.html";
    private static final String erro404FileName = "404.html";
    private static final String erro500FileName = "500.html";
    private static final String erro501FileName = "501.html";
    private static final String faviconFileName = "favicon.ico";
    private static final String manualFileName = "manual.html";

    public FileNames() {
        System.out.println("FileName Library acessada.");
    }

    public static String getIniFileName() {
        return iniFileName;
    }

    public static String getDefaultServerIndexFileName() {
        return indexFileName;
    }

    public static String getDefaultServerBGFileName() {
        return backgroundFileName;
    }

    public static String getDefaultServerHeaderFileName() {
        return headerFileName;
    }

    public static String getDefaultFolderIconFileName() {
        return folderIconFileName;
    }

    public static String getDefaultFileIconFileName() {
        return fileIconFileName;
    }

    public static String getDefaultServerCssFileName() {
        return cssFileName;
    }

    public static String getDefaultServerJsFileName() {
        return jsFileName;
    }

    public static String getDefaultServerErro403FileName() {
        return erro403FileName;
    }

    public static String getDefaultServerErro404FileName() {
        return erro404FileName;
    }

    public static String getDefaultServerErro500FileName() {
        return erro500FileName;
    }

    public static String getDefaultServerErro501FileName() {
        return erro501FileName;
    }

    public static String getDeafaultServerFaviconFileName() {
        return faviconFileName;
    }

    public static String getManualServerFileName() {
        return manualFileName;
    }
}
