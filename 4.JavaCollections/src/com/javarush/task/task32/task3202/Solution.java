package com.javarush.task.task32.task3202;


import java.io.*;
import java.util.stream.Collectors;

/*
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) {
        if (is == null)
            return new StringWriter();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringWriter sw = new StringWriter();
        sw.write(reader.lines().collect(Collectors.joining(System.lineSeparator())));
        return sw;
    }
}