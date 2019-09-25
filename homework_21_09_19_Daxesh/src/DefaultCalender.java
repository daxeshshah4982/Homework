import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DefaultCalender {
    public static void main(String[] args) {
        calender();
    }

    public static void calender() {
        LocalDate date = LocalDate.now();

        System.out.println("\nDefault format of LocalDate : " + date);     //default format
        System.out.println(date.format(DateTimeFormatter.ofPattern("\ndd::MMM::yyyy")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("\nyyyy::MM::dd")));//specific format
        System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
;
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\nDefault format of LocalDateTime : " + dateTime);      //default format
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("\ndd::MMM::yyyy HH::mm::ss")));

        //specific format

        Instant timestamp = Instant.now();
        System.out.println("\nDefault format of Instant=" + timestamp);          //default format

        LocalDateTime dt = LocalDateTime.parse("\n23::Sep::2019 09::27::48",          ////Parse examples
                DateTimeFormatter.ofPattern("\ndd::MMM::yyyy HH::mm::ss"));
        System.out.println("\nDefault format after parsing = " + dt );
    }
}
