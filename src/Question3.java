import java.util.*;
import java.time.*;
import java.text.*;

public class Question3 {
    public static void main(String[] args) {
        try {
            // Get calendar set to current date and time
            Calendar c = Calendar.getInstance();

            // Set the calendar to monday of the current week
            c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

            System.out.println();
            // Print dates of the current week starting on Monday
            DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
            System.out.println(df.format(c.getTime()));

            c.add(Calendar.DATE, 8);

            System.out.println(df.format(c.getTime()));
            System.out.println();
        }
        catch(Exception e) {
            System.out.println("Error!");
        }
    }
}
