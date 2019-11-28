import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateEx
{
  public static void main(String args[])
  {
    System.out.println("Today's date is: " + LocalDate.now());
    LocalDate tom = LocalDate.now().plusDays(1);
    System.out.println("Tomorrow is: " + tom);
    LocalDate nextWeek = LocalDate.now().plus(1,ChronoUnit.WEEKS);
    LocalDate prevYear = LocalDate.now().minus(1, ChronoUnit.YEARS);
    LocalDate prevYear_nextMonth = prevYear.plus(1, ChronoUnit.MONTHS);
    System.out.println("1 week from today date will be: " + nextWeek);
    System.out.println("1 year back from today date will be: " + prevYear);
    System.out.println("1 year back + 1 month forward: " + prevYear_nextMonth);
    boolean isAfter = prevYear_nextMonth.isAfter(prevYear);
    boolean isBefore = LocalDate.now().isBefore(nextWeek);
    boolean isBefore1 = nextWeek.isBefore(LocalDate.now());
    System.out.println("Testing out isAfter method using variables: " + isAfter);
    System.out.println("Is this week's date before next week's date: " + isBefore);
    System.out.println("Is next weeks's date before this week's date: " + isBefore1);
  }
}
