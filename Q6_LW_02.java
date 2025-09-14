import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q6_LW_02 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");


        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}

