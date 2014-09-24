package br.com.schumaker.network;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 */
public class Addresses {

    private static final String root = System.getProperties().getProperty("user.dir") + "/";

    public Addresses() {
        System.out.println("Adress Library acessada.");
    }

    public static String getWWWFolderPath() {
        return root + FolderNames.getDefaultServerRootFolderName() + "/";
    }

    public static String getErrorFolderPath() {
        return root + FolderNames.getDefaultServerErrorFolderName() + "/";
    }

    public static String getImageFolderPath() {
        return getWWWFolderPath() + FolderNames.getDefaultServerImagesFolderName() + "/";
    }

    public static String getCssFolderPath() {
        return getWWWFolderPath() + FolderNames.getDefaultServerCssFolderName() + "/";
    }

    public static String getJsFolderPath() {
        return getWWWFolderPath() + FolderNames.getDefaultServerJsFolderName() + "/";
    }

    public static String getIniFilePath() {
        return root + FileNames.getIniFileName();
    }

    public static String getIndexServerFilePath() {
        return getWWWFolderPath() + FileNames.getDefaultServerIndexFileName();
    }

    public static String getBGServerFilePath() {
        return getImageFolderPath() + FileNames.getDefaultServerBGFileName();
    }

    public static String getHeaderServerFilePath() {
        return getImageFolderPath() + FileNames.getDefaultServerHeaderFileName();
    }

    public static String getFolderServerFilePath() {
        return getImageFolderPath() + FileNames.getDefaultFolderIconFileName();
    }

    public static String getFileServerFilePath() {
        return getImageFolderPath() + FileNames.getDefaultFileIconFileName();
    }

    public static String getCssServerFilePath() {
        return getCssFolderPath() + FileNames.getDefaultServerCssFileName();
    }

    public static String getJsServerFilePath() {
        return getJsFolderPath() + FileNames.getDefaultServerJsFileName();
    }

    public static String get403ErrorFilePath() {
        return getErrorFolderPath() + FileNames.getDefaultServerErro403FileName();
    }

    public static String get404ErrorFilePath() {
        return getErrorFolderPath() + FileNames.getDefaultServerErro404FileName();
    }

    public static String get500ErrorFilePath() {
        return getErrorFolderPath() + FileNames.getDefaultServerErro500FileName();
    }

    public static String get501ErrorFilePath() {
        return getErrorFolderPath() + FileNames.getDefaultServerErro501FileName();
    }

    public static String getFaviconFilePath() {
        return getWWWFolderPath() + FileNames.getDeafaultServerFaviconFileName();
    }

    public static String getManualFilePath() {
        return getWWWFolderPath() + FileNames.getManualServerFileName();
    }
}
