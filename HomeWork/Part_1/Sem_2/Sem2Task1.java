package Sem_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Sem2Task1 {
    public static StringBuilder createdString(String str, int number){
        StringBuilder someStr = new StringBuilder();
        someStr.append(String.valueOf(str).repeat(Math.max(0, number)));
        return someStr;
    }
    public static void main(String[] args) {
        File file = new File("test.txt");
        StringBuilder text = createdString("test", 100);

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8))
        {
            osw.write(String.valueOf(text));
            System.out.println("Successfully written data to the file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
