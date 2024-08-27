public class Convert_Year_Into_Year_Months_Days {
    public static void main(String[] args) {
        int days = 1000;
        convertDays(days);
    }

    public static void convertDays(int days) {
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int daysLeft = remainingDays % 30;

        System.out.println(days + " days = " + years + " years, " + months + " months, and " + daysLeft + " days.");
    }
}
