package Sem_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Sem2Task2 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        String pathProject = System.getProperty("user.dir");
        File dir = new File(pathProject);


        System.out.println("Текущая папка");
        System.out.println(pathProject);

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos,
                     StandardCharsets.UTF_8)) {

            for (String fname : Objects.requireNonNull(dir.list())) {
                osw.write(String.valueOf(fname + "\n"));
            }

            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}