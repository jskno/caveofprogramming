package com.solutions.spring.beans;

import com.solutions.spring.interffaces.LogWriter;
import org.springframework.stereotype.Component;

/**
 * Created by Jose on 3/11/2017.
 */
@Component
public class ConsoleWriter implements LogWriter {

    public void write(String text) {
        System.out.println("Write to console: " + text);
    }
}
