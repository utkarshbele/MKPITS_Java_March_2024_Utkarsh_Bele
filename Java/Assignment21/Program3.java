package Assignment21;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Program 3
//Given a time in -hour AM/PM format, convert it to military (24-hour) time.
//Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
// 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
//Example: s = “12:01:01PM” should return '12:01:00' and “12:01:00AM” should return '00:01:00'.
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 12-hour time
        System.out.print("Enter time in 12-hour format (hh:mm:ss a): ");
        String inputTime = scanner.next();

        String militaryTime = convertToMilitaryTime(inputTime);
        System.out.println(militaryTime);
        scanner.close();
    }

    public static String convertToMilitaryTime(String time) {
        String[] timeParts = time.split(":");
        int hour = Integer.parseInt(timeParts[0]);
        String minutes = timeParts[1];
        String seconds = timeParts[2].substring(0, 2); // Extract only seconds
        String period = timeParts[2].substring(2); // Extract AM/PM

        if (period.equalsIgnoreCase("PM") && hour != 12) {
            hour += 12; // Add 12 for hours in PM except 12PM which is already 12:00
        } else if (period.equalsIgnoreCase("AM") && hour == 12) {
            hour = 0; // Convert 12AM to 00:00
        }

        return String.format("%02d:%s:%s", hour, minutes, seconds);

    }
}
