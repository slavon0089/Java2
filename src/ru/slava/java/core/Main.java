package ru.slava.java.core;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    void array() throws MyArraySizeException, MyArrayDataException {
        String massiv = "1253785463254789";
        for (int i = 0; i < massiv.length(); i++) {
            if (massiv.charAt(i) < '1' || massiv.charAt(i) > '9')
                throw new MyArrayDataException("symbol " + (i + 1) + " is not a number");
        }
        calculation(massiv);
    }

    void calculation(String massiv) throws MyArraySizeException, MyArrayDataException {
        int len = 0;

        if (massiv.length() != 16) throw new MyArraySizeException("matrix is not 4 x 4");

        int sum = 0;
        Integer[][] convMassiv = new Integer[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                convMassiv[i][j] = Integer.parseInt(String.valueOf(massiv.charAt(len)));
                len++;
                System.out.print(convMassiv[i][j] + " ");
                sum = convMassiv[i][j] + sum;

            }
            System.out.println();
        }
        System.out.println("sum = " + sum);

    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        Main ob = new Main();
        ob.array();
    }
}