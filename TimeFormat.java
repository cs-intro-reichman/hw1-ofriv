public class TimeFormat {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
        // Print hours for debugging

        String timeOfDay = "";
        if (hours < 12) {
            timeOfDay = "AM";
        } else {
            timeOfDay = "PM";
        }

        // Convert hours to 12-hour format
        if (hours == 0) {
            hours = 0;
        } else if (hours > 12) {
            hours -= 12;
        }


        // Format minutes with leading zero if necessary
        String formattedMinutes = (minutes < 10) ? "0" + minutes : "" + minutes;  // Concatenation to string

        // Display the result in the desired format
        System.out.println(hours + ":" + formattedMinutes + " " + timeOfDay);
    }
}
