import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class localTime {

	public static void main(String[] args) {
		
		
		        // Get the current time
		        LocalTime currentTime = LocalTime.now();
		        
		        // Format the current time as "HH:mm a" (AM/PM format)
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		        String formattedTime = currentTime.format(formatter);
		        
		        System.out.println("Formatted Current Time: " + formattedTime);
		        
		        // Target time to compare (05:00 PM)
		        String targetTime = "05:00 PM";
		        
		        // Compare the formatted time with the target time
		        if (formattedTime.equals(targetTime)) {
		            System.out.println("Current time is 05:00 PM");
		        } else {
		            System.out.println("Current time is not 05:00 PM");
		        }
		    }
		
}
		