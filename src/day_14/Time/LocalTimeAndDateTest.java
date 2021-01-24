package day_14.Time;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author xiaoxia
 * @create 2020/12/7 8:13 下午
 */
public class LocalTimeAndDateTest {
    @Test
    public void testLocalDateTime() {
        //LocalTime LocalDate LocalTimeDate

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1 = LocalTime.of(10, 20, 3);
        System.out.println(localTime1);

        int hour = localTime.getHour();
        int minute = localTime.getMinute();

        LocalTime localTime2 = localTime.withHour(2);
        System.out.println(localTime2);

        LocalDateTime localDateTime = LocalDateTime.now();
        int dayOfMonth = localDateTime.getDayOfMonth();

    }

    @Test
    public void testInstant() {
        Instant now = Instant.now();
        System.out.println(now);

        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
    }

    @Test
    public void testDateTimeFormatter() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh-mm-ss");
        String str = dateTimeFormatter.format(LocalDateTime.of(2020, 10, 1, 10, 10, 10));
        System.out.println(str);
        TemporalAccessor parse = dateTimeFormatter.parse(str);
        System.out.println(parse);

    }

    @Test
    public void testY() {
        LocalDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 1, 0, 0, 0);
        int dayOfYear = localDateTime.getDayOfYear();
        LocalDateTime localDateTime1 = localDateTime.withHour(2);

        Instant now = Instant.now();
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(10));
    }
}
