package br.com.dnkt.javanewfeatures.java9.interfaces;

public interface Java9InterfaceExample {

    default void logInfo(String message) {
        log(message, "INFO");
    }

    default void logWarn(String message) {
        log(message, "WARN");
    }

    default void logError(String message) {
        log(message, "ERROR");
    }

    default void logFatal(String message) {
        log(message, "FATAL");
    }

    //New feature Java 9
    private void log(String message, String level) {
        System.out.println("Starting logging message");

        System.out.println(level + " : " + message);

        System.out.println("Finish log message");
    }
}
