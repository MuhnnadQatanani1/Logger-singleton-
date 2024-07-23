

package com.mycompany.logger;


public class Logger {

  
    private static Logger instance;
    
    // Private constructor to prevent instantiation
    private Logger() {
    }

    // Synchronized method to control simultaneous access
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log: " + message);
    }

    public static void main(String[] args) {
        // Accessing the Logger singleton
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Checking if both instances are the same
        System.out.println("logger1 is logger2: " + (logger1 == logger2));

        // Logging messages
        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");
    }
}


