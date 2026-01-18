package coreprogramming.extrasbuiltIn;

public class TimeZone {

    /*
     * This program calculates and displays the current time in different time zones: GMT, IST, and PST.
     * It uses the system's current time in milliseconds since 1 Jan 1970 (Unix epoch)
     * and applies offsets to calculate the time in different time zones.
     * 
     * The program demonstrates arithmetic operations, method creation, and string formatting in Java.
     */

    /**
     * Converts milliseconds since epoch to a formatted HH:mm:ss time string.
     *
     * millis Time in milliseconds
     *  Formatted time string
     */
    public static String getTime(long millis) {
        long totalSeconds = millis / 1000;            // Convert milliseconds to total seconds
        long seconds = totalSeconds % 60;             // Seconds part
        long totalMinutes = totalSeconds / 60;        // Total minutes
        long minutes = totalMinutes % 60;             // Minutes part
        long totalHours = totalMinutes / 60;          // Total hours
        long hours = totalHours % 24;                 // Hours part (24-hour format)

        // Return formatted time as HH:mm:ss
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        long currentMillis = System.currentTimeMillis(); // Get current time in milliseconds

        // Define time zone offsets in milliseconds
        long gmtOffset = 0;                              // GMT offset
        long istOffset = 5 * 60 * 60 * 1000 + 30 * 60 * 1000; // IST offset (+5:30)
        long pstOffset = -8 * 60 * 60 * 1000;           // PST offset (-8:00)

        // Display current time in different time zones
        System.out.println("Current time in GMT: " + getTime(currentMillis + gmtOffset));
        System.out.println("Current time in IST: " + getTime(currentMillis + istOffset));
        System.out.println("Current time in PST: " + getTime(currentMillis + pstOffset));
    }
}
