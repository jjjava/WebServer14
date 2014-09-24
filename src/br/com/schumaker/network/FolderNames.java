package br.com.schumaker.network;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 */
public class FolderNames {

    private static final String serverRootFolderName = "www";
    private static final String serverErrorFolderName = "error";
    private static final String serverImagesFolderName = "images";
    private static final String serverCssFolderName = "css";
    private static final String serverJsFolderName = "js";

    public FolderNames() {
        System.out.println("FolderNames Library acessada.");
    }

    public static String getDefaultServerRootFolderName() {
        return serverRootFolderName;
    }

    public static String getDefaultServerErrorFolderName() {
        return serverErrorFolderName;
    }

    public static String getDefaultServerImagesFolderName() {
        return serverImagesFolderName;
    }

    public static String getDefaultServerCssFolderName() {
        return serverCssFolderName;
    }

    public static String getDefaultServerJsFolderName() {
        return serverJsFolderName;
    }
}
