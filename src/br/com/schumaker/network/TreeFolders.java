package br.com.schumaker.network;

import java.io.File;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 */
public class TreeFolders {

    public TreeFolders() {

    }

    public static void checkTreeFolders() {
        System.out.println(">Verificando arvore do diretorios.");

        File www = new File(Addresses.getWWWFolderPath());
        if (!www.exists()) {
            www.mkdir();
            System.out.println(" - " + FolderNames.getDefaultServerRootFolderName() + " folder criada.");
        } else {
            System.out.println(" - " + FolderNames.getDefaultServerRootFolderName() + " folder [OK]");
        }

        File error = new File(Addresses.getErrorFolderPath());
        if (!error.exists()) {
            error.mkdir();
            System.out.println(" - " + FolderNames.getDefaultServerErrorFolderName() + " folder criada.");
        } else {
            System.out.println(" - " + FolderNames.getDefaultServerErrorFolderName() + " folder [OK].");
        }

        File img = new File(Addresses.getImageFolderPath());
        if (!img.exists()) {
            img.mkdir();
            System.out.println(" - " + FolderNames.getDefaultServerImagesFolderName() + " folder criada.");
        } else {
            System.out.println(" - " + FolderNames.getDefaultServerImagesFolderName() + " folder [OK].");
        }

        File js = new File(Addresses.getJsFolderPath());
        if (!js.exists()) {
            js.mkdir();
            System.out.println(" - " + FolderNames.getDefaultServerJsFolderName() + " folder criada.");
        } else {
            System.out.println(" - " + FolderNames.getDefaultServerJsFolderName() + " folder [OK]");
        }

        File css = new File(Addresses.getCssFolderPath());
        if (!css.exists()) {
            css.mkdir();
            System.out.println(" - " + FolderNames.getDefaultServerCssFolderName() + " folder criado.");
        } else {
            System.out.println(" - " + FolderNames.getDefaultServerCssFolderName() + " folder [OK]");
        }

        System.out.println(">Concluida verificacao da arvore de diretorios.");
    }
}
