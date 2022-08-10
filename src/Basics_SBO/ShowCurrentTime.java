package Basics_SBO;

public class ShowCurrentTime {
    public static void main(String[] args) {
        final int MILLISECONDS_PER_SECOND = 1000;
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int HOURS_PER_DAY = 24;
        final int GMT = 3;

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds;
        long totalMinutes;
        long totalHours;

        long currentHour;
        long currentMinute;
        long currentSecond;

        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        currentMinute = totalMinutes % MINUTES_PER_HOUR;
        totalHours = totalMinutes / MINUTES_PER_HOUR;
        currentHour = (totalHours % HOURS_PER_DAY) + GMT;
        System.out.println("Текущее время " + currentHour + " " + currentMinute);

    }
}
