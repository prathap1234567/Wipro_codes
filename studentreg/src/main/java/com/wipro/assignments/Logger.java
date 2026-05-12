package com.wipro.assignments;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger logger;
    private Logger(){

    }
    public static Logger getInstance(){
        if (logger==null){
            logger= new Logger();
        }
        return logger;
    }
    public void log(String message){
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time=LocalDateTime.now().format(formatter);
        System.out.println("[" +time+"] "+message);
    }

}