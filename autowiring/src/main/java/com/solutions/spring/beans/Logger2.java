package com.solutions.spring.beans;

import com.solutions.spring.interffaces.LogWriter;

/**
 * Created by Jose on 3/11/2017.
 */
public class Logger2 {

    private LogWriter consoleWriter;
    private LogWriter fileWriter;

    public void setConsoleWriter(LogWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeConsole(String text) {
        consoleWriter.write(text + " from Logger2");
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }
}
