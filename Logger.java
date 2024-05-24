package org.example;

import java.io.IOException;
import java.util.logging.*;

public class Logger {
    // Настройка
    public static java.util.logging.Logger setupLogger(String className) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(className);
        try {
            FileHandler fileHandler = new FileHandler(className + ".log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logger;
    }
}
