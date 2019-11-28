import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;
import static java.lang.System.out;

public class TemporalAdjust
{
  public static void main(String args[])
  {
    LocalDate date = LocalDate.now();
    out.println("Today's date is: "+date);

    LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfNextMonth());
    out.println("Second day of next month is: "+ firstDay);

    LocalDate nextThurs = date.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
    out.println("Next thursday is: " +nextThurs);

    LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
    out.println("Last day of the month is: "+lastDay);
  }
}
