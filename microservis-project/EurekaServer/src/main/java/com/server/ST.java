package com.server;

public class ST {
    public static void main(String[] args) {
        String str = "i am hukam singh";
        String [] strings = str.split(" ");
        String  reverse = "";
        for (int i = strings.length-1; i >= 0; i-- ){
            reverse = reverse + strings[i] + " ";
        }
        System.out.println(reverse);
    }
}
