package br.com.schumaker.run;

import br.com.schumaker.core.ThreadCore;
import br.com.schumaker.io.IniReader;
import br.com.schumaker.io.IniWriter;
import br.com.schumaker.network.TreeFolders;
import br.com.schumaker.resource.CopyResource;
import br.com.schumaker.timer.ScheduledTasks;

/**
 *
 * @author Hudson Schumaker
 */
public class WebServer14 {

    public static void main(String[] args) {
        System.out.println("#Inicianlizando...");
        IniWriter.createIniFile();
        String[] params = IniReader.readWWWini();
        TreeFolders.checkTreeFolders();
        CopyResource copyResource = new CopyResource(params[1],params[2]);
        copyResource.copyAllResources();

        ScheduledTasks scheduledTasks = new ScheduledTasks(params[1]);
        scheduledTasks.start();
        
        ThreadCore core = new ThreadCore(Integer.parseInt(params[0]), params[1]);
    }
}