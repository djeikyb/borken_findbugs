package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {

    public static void main(String[] args) {
        Path p = Paths.get("asdfa");
        if (p == null) return;
        if (p.getFileName() == null) return;

        final String s1 = p.getFileName() == null ? "" : p.getFileName().toString();

        final String s0;
        if (p.getFileName() != null) {
            s0 = p.getFileName().toString();
        } else {
            s0 = "";
        }

        System.out.println(s0);
        System.out.println(s1);
    }

}
