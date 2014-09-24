package br.com.schumaker.io;

import br.com.schumaker.network.Addresses;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 */
public class IniReader {

    public static String[] readWWWini() {
        String[] params = new String[3];
        BufferedReader in;
        String path = Addresses.getIniFilePath();
        try {
            System.out.println("Lendo arquivo .ini");
            in = new BufferedReader(new FileReader(path));
            String line;
            while ((line = in.readLine()) != null) {
                if (!line.startsWith("#")) {
                    line = line.trim();
                    if (line.startsWith("P")) {
                        String aux[] = line.split(";");
                        params[0] = aux[1];
                    }
                    if (line.startsWith("I")) {
                        String aux[] = line.split(";");
                        params[1] = aux[1];
                    }
                    if (line.startsWith("C")) {
                        String aux[] = line.split(";");
                        params[2] = aux[1];
                    }
                }
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("Arquivo .ini lido.");
        return params;
    }
}
