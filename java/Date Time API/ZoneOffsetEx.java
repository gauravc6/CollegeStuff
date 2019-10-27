import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import static java.time.temporal.ChronoUnit.*;
import java.time.zone.ZoneOffsetTransition;
import static java.lang.System.out;

public class ZoneOffsetEx
{
  public static void main(String args[])
  {
    ZoneId paris = ZoneId.of("Europe/Paris");
    ZoneId india = ZoneId.of("Asia/Kolkata");
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

    LocalDateTime dateTime = LocalDateTime.of(date,time);
    ZonedDateTime semStart = ZonedDateTime.of(date,time,paris);
    ZoneOffset offset = semStart.getOffset();
    out.println("Zone offset is: " + offset);

    ZonedDateTime here = ZonedDateTime.now(india).truncatedTo(MINUTES);

    out.println("Here now:   " + here);
    out.println("Sem start:  " + semStart);
  }
}
