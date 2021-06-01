package ru.slava.java.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppData {

    public void reader() throws IOException {
        String[] headers;
        int[][] data;


        try (BufferedReader in =
                     new BufferedReader(
                             new FileReader("file.csv")
                     )) {

            String line = null;
            int count = 0;
            if ((line = in.readLine()) != null) {
                headers = line.split("\\;");
                for (String t : headers) {
                    System.out.print(t + " ");
                    count++;
                }
            }
            data = new int[count][3];
            for (int i = 0; (line = in.readLine()) != null; i++) {

                String[] temp = line.split("\\;");
                System.out.println();
                for (int j = 0; j < temp.length; j++) {
                    data[i][j] = Integer.parseInt(temp[j]);
                    System.out.print(data[i][j] + " ");
                }

            }

        }
    }


}
