package homeWork.java1_2.lesson4;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class FileUtils {

    public static File fileLog = new File("ChatLog.dat");;

    public static void writeLogFile(String log) throws IOException {


        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileLog,false))){
            writer.write(log + "\n");
            writer.flush();

        };

    }

    public static List<String> readLogFile() throws IOException {
        List<String> list = null;
        if (fileLog.exists()) {
            list = Files.readAllLines(fileLog.toPath());
        }
        else {
            fileLog = new File("ChatLog.dat");
        }
        return list;
    }


}
