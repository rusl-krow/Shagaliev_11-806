package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ThreadWriter extends Thread {
    private String str;
    public ThreadWriter(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream(new
                    File("Files/out.txt"), true));
            pw.println(getStr());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


