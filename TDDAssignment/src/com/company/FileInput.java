package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



public class FileInput {
    public int FileInput(String f) throws Exception{
        Path file= Paths.get(f);
        Scanner sc=new Scanner(file);
        int x=sc.nextInt();
        return x;
    }
}