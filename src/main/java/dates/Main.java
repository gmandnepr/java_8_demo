package dates;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Period period = Period.of(1, 0, 0);
        Duration duration = Duration.ofHours(1).plusMinutes(15);


        localDateTime.plus(period).plus(duration);

        LocalDate today = LocalDate.now();
        LocalDate something = LocalDate.of(1960, Month.JANUARY, 1);

        System.out.println(Period.between(something, today).toString());

        System.out.println(Duration.ofDays(1).toString());

        System.out.println(Clock.systemUTC().instant());

        System.out.println(LocalDateTime.of(localDate, localTime).atZone(ZoneId.of("UTC")));
        System.out.println(LocalDateTime.of(localDate, localTime).atOffset(ZoneOffset.of("+2")));

    }
}
