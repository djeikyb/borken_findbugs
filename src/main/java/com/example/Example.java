package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {

    public static void main(String[] args) {
        Path p = Paths.get("asdfa");
        if (p == null) return;
        if (p.getFileName() == null) return;
        String s = p.getFileName().toString();
        System.out.println(s);
    }

}
