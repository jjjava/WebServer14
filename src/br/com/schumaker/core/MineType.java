package br.com.schumaker.core;

/**
 *
 * @author Hudson Schumaker
 */
public class MineType {

    public static String getMineType(String fileName) {

        if (fileName.endsWith(".html")) {
            return "Content-Type:text/html\r\n";
        }
        if (fileName.endsWith(".jpg")) {
            return "Content-Type:image/jpeg\r\n";
        }
        if (fileName.endsWith(".png")) {
            return "Content-Type:image/png\r\n";
        }
        if (fileName.endsWith(".gif")) {
            return "Content-Type:image/gif\r\n";
        }
        if (fileName.endsWith(".zip")) {
            return "Content-Type:application/zip\r\n";
        }
        if (fileName.endsWith(".pdf")) {
            return "Content-Type:application/pdf\r\n";
        }
        if (fileName.endsWith(".csv")) {
            return "Content-Type:application/csv\r\n";
        }
        if (fileName.endsWith(".xml")) {
            return "Content-Type:application/xml\r\n";
        }
        if (fileName.endsWith(".rtf")) {
            return "Content-Type:application/rtf\r\n";
        }
        if (fileName.endsWith(".mov")) {
            return "Content-Type:application/quicktime\r\n";
        }

        if (fileName.endsWith(".mp4")) {
            return "Content-Type:video/mp4\r\n";
        }
        if (fileName.endsWith(".ico")) {
            return "Content-Type:image/ico\r\n";
        }
        return null;
    }
}
