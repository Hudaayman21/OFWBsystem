/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mehnaz
 */
import java.time.LocalDateTime;

public class SystemTime {
    private static int day = 1;
    private static int hour = 0;
    private static int minute = 0;

    public static void setTime(int d, int h, int m) {
        day = d;
        hour = h;
        minute = m;
    }

    public static void advanceMinutes(int m) {
        minute += m;
        while (minute >= 60) {
            minute -= 60;
            hour++;
        }
        while (hour >= 24) {
            hour -= 24;
            day++;
        }
    }

    public static String getTime() {
        return "Day " + day + " " + String.format("%02d", hour) + ":" + String.format("%02d", minute);
    }

    // ✅ THIS is the method you're missing:
    public static LocalDateTime getCurrentTime() {
        return LocalDateTime.of(2023, 1, day, hour, minute);
    }
}
