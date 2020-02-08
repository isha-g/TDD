package com.company;

import java.util.Scanner;


class OddOrEven {

    private static FileInput fi=new FileInput();

    OddOrEven() throws Exception{};

    public void setReadObject(FileInput file){
        fi=file;
    }


    public static boolean checkeo() throws Exception {
        int number = fi.FileInput("test.txt");
        return number % 2 == 0;
    }
}