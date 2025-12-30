import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class date{
    public static void main(String[] args){

        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String datetime = date.format(time);
        System.out.println(datetime);
    }
}