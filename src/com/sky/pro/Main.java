package com.sky.pro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str = "комок";
        char [] arr1 = str.toCharArray();
        char [] arr2 = new char [arr1.length];

        for (int i = 0; i<arr1.length; i++) {
            arr2 [i] += arr1[i];
        }

        int last = arr2.length-1;
        for (int j = 0; j<arr2.length/2; j++) {
            char temp = arr2[last-j];
            arr2[last-j] = arr2 [j];
            arr2 [j] = temp;
        }

        if (Arrays.equals (arr1, arr2)) {
            System.out.print ("Строка является палиндромом");
        } else
            System.out.print ("Строка не является палиндромом");

    }
}
