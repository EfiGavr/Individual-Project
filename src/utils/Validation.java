package utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Validation {

    public boolean isValidLocalDate(String localDateString) {

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(localDateString, dateFormatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isValidLocalDateTime(String localDateTimeString) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        try {
            LocalDateTime.parse(localDateTimeString, formatter);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

//    public boolean isDateSundayOrSaturday(LocalDateTime localDateTime) {
//        if (localDateTime.getDayOfWeek().equals(DayOfWeek.SATURDAY) || localDateTime.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
//            return false;
//        }
//        return true;
//
//    }

}
