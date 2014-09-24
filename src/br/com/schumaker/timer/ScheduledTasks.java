package br.com.schumaker.timer;

import br.com.schumaker.io.IndexWriter;

/**
 *
 * @author Hudson Schumaker
 */
public class ScheduledTasks implements Runnable {

    private String indexFileName;

    public ScheduledTasks(String indexFileName) {
        this.indexFileName = indexFileName;
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.setName("Timer");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(30000 * 60);
                IndexWriter.createIndexFile(indexFileName);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}