package com.solutions.spring.beans;

import com.solutions.spring.interffaces.LogWriter;

/**
 * Created by Jose on 3/11/2017.
 */
public class Logger {

    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;

    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }
}
