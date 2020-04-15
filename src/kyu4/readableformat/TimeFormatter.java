package kyu4.readableformat;

public class TimeFormatter {
    public static final int MINUTE = 60;
    public static final int HOUR = 60 * MINUTE;
    public static final int DAY = 24 * HOUR;
    public static final int YEAR = 365 * DAY;

    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";

        int years = seconds / YEAR;
        seconds -= years * YEAR;

        int days = seconds / DAY;
        seconds -= days * DAY;

        int hours = seconds / HOUR;
        seconds -= hours * HOUR;

        int minutes = seconds / MINUTE;
        seconds -= minutes * MINUTE;

        StringBuilder answer = new StringBuilder();

        if (seconds > 0) {
            answer.insert(0, formatCount(seconds, "second"));
            if (minutes > 0 || hours > 0 || days > 0 || years > 0) {
                answer.insert(0, " and ");
            }
        }
        if (minutes > 0) {
            answer.insert(0, formatCount(minutes, "minute"));
            if (hours > 0 || days > 0 || years > 0) {
                if (seconds > 0)
                    answer.insert(0, ", ");
                else
                    answer.insert(0, " and ");
            }
        }
        if (hours > 0) {
            answer.insert(0, formatCount(hours, "hour"));
            if (days > 0 || years > 0) {
                if (minutes > 0 || seconds > 0)
                    answer.insert(0, ", ");
                else
                    answer.insert(0, " and ");
            }
        }
        if (days > 0) {
            answer.insert(0, formatCount(days, "day"));
            if (years > 0) {
                if (hours > 0 || minutes > 0 || seconds > 0)
                    answer.insert(0, ", ");
                else
                    answer.insert(0, " and ");
            }
        }
        if (years > 0) {
            answer.insert(0, formatCount(years, "year"));
        }

        return answer.toString();
    }

    private static String formatCount(int n, String unit) {
        if (n == 1) return n + " " + unit;
        else return n + " " + unit + "s";
    }
}
