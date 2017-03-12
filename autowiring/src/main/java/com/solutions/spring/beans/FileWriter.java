package com.solutions.spring.beans;

import com.solutions.spring.interffaces.LogWriter;

/**
 * Created by Jose on 3/11/2017.
 */
public class FileWriter implements LogWriter {

    public void write(String text) {
        System.out.println("Write to a file: " + text);
    }
}
