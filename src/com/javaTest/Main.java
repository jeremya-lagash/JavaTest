package com.javaTest;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        doTryWithResourcesMulti();
    }

    public static void doTryWithResourcesMulti() {
        char[] buff = new char[50];
        int length;
        try (Reader reader = Helper.openReader("file.txt");
             Writer writer = Helper.openWriter("jeremy.txt"))  {
            while((length = reader.read(buff)) >= 0) {
                System.out.println("\nlength: " + length);
                writer.write(buff, 0, length);
            }
        } catch(IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
