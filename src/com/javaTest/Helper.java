package com.javaTest;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;


public class Helper {

    static public Reader openReader(String fileName) throws IOException {
        return Files.newBufferedReader(Paths.get(fileName));
    }

    static public Writer openWriter(String fileName) throws IOException {
        return Files.newBufferedWriter(Paths.get(fileName));
    }
    //[Z,T,R,O,H,G,I,D,..Q]
    //[Character,Character,Character,Character,Character,Character,Character,Character,..Character]
    static public ArrayList<Character> sortAscending(ArrayList<Character> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }
}
