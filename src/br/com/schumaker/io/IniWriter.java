package br.com.schumaker.io;

import br.com.schumaker.network.Addresses;
import br.com.schumaker.template.IniTemplate;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.1
 */
public class IniWriter {

    public static void createIniFile() {
        File file = new File(Addresses.getIniFilePath());
        if (!file.exists()) {
            try {
                System.out.println("Criando arquivo .ini");
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter buffer = new BufferedWriter(fileWriter);
                buffer.write(IniTemplate.getWWWini());
                buffer.flush();
                buffer.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
            System.out.println("Arquivo .ini criado.");
        }
    }
}
