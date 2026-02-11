import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class TimeZones {
    public static void main(String[] args){
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
        ZonedDateTime GMT = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime IST = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime PST= ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in GMT: " + GMT.format(Formatter));
        System.out.println("Current Time in IST: " + IST.format(Formatter));
        System.out.println("Current Time in PST: " + PST.format(Formatter));

    }
}
