import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy hh:mm:ss a");
        return currentDateTime.format(formatter);
    }
}
