
package com.mycompany.logger;


public class Main {
      public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Checking if both instances are the same
        System.out.println("logger1 is logger2: " + (logger1 == logger2));

        // Logging messages
        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");
    }
    
}
