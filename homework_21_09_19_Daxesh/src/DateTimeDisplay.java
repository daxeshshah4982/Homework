// Write a Java program to display the dates in the following formats.


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDisplay {
    public static void main(String[] args) {
        date();
    }

    public static void date() {

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/YYYY  HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dt.format(now));

    }

}


