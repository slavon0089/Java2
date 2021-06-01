package ru.slava.java.core.hw5;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main  {

    public static void main(String[] args) throws IOException {



        File file = new File("file.csv");
/*
        try (OutputStream out = new FileOutputStream(file)) {
            out.write("value1;value2;value3 \n".getBytes());
            out.write("100;200;300 \n".getBytes());
            out.write("110;210;310 \n".getBytes());
            out.write("120;220;320 \n".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        AppData appdata = new AppData();
        appdata.datas();

    }
}
