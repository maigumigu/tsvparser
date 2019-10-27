package main.java;

import main.java.util.BasicTsvParser;
import main.java.util.IOUtil;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to TSV parser");
        System.out.println("======================");
//        new IOUtil().testIOUtil();

        BasicTsvParser basicTsvParser = new BasicTsvParser();
        basicTsvParser.readTSV();
        basicTsvParser.printTSV();
    }
}

