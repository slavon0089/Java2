package ru.slava.java.core.hw5;
import javax.sound.sampled.Line;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppData {


    private String[] headers;
    private int [] data;


    public void datas() throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("file.csv"))) {
            String str;
            int i =0;
            while ((str = reader.readLine()) != null) {

                data[i] += Integer.parseInt(str);
                str = reader.readLine();
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
