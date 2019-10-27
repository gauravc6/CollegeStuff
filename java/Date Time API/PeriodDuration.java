import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Duration;
import java.time.Period;
import static java.lang.System.out;

public class PeriodDuration
{
  public static void main(String args[])
  {
    //period
    LocalDate date1 = LocalDate.now();
    LocalDate date2 = LocalDate.of(2019,Month.DECEMBER, 25);

    Period gap = Period.between(date2,date1);
    out.println("Gap between 2 dates is " + date1 + date2 + "is a period of: "+gap);

    //duration
    LocalTime time = LocalTime.now();

    Duration dur = Duration.ofHours(6);

    LocalTime afterSix = time.plus(dur);
    out.println("After 6 hours time will be: "+afterSix);

    Duration time_gap = Duration.between(time,afterSix);
    out.println("Gap between the 2 times is: "+time_gap);
  }
}
