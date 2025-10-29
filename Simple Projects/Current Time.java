import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time {

    public static void main(String[] args) {
        
        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH : mm : ss");
        System.out.println("Current time : " + time.format(formatter));
    }
}
