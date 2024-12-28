package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance; // Единственный экземпляр
    private int num = 1; // Номер сообщения

    // Приватный конструктор
    private Logger() {}

    // Метод для получения единственного экземпляра
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Логирование сообщения
    public void log(String msg) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        System.out.println("[" + timestamp + " " + num++ + "] " + msg);
    }
}
