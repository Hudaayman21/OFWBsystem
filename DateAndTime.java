import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
    private int day;
    private String time; // like "10:00"

    public DateAndTime(int day, String time) {
        this.day = day;
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public LocalDateTime toLocalDateTime() {
        // We'll simulate Day 1 as today, Day 2 as today + 1, etc.
        java.time.LocalDate baseDate = java.time.LocalDate.now().plusDays(day - 1);
        java.time.LocalTime localTime = java.time.LocalTime.parse(time);
        return LocalDateTime.of(baseDate, localTime);
    }
}
