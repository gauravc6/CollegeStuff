import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import static java.lang.System.out;

public class LocalTimeEx
{
  public static void main(String[] args)
  {
    LocalTime now, nowMinus, befHrsMins, dinner, waketime;
    now = LocalTime.now();
    out.println("The time now is: " + now);
    nowMinus = now.plusHours(-1).plusMinutes(-20);
    out.println("The time 1 hour 20 mins ago was: " + nowMinus);
    befHrsMins = nowMinus.truncatedTo(ChronoUnit.MINUTES);
    out.println("Before time truncated to mins: "+ befHrsMins);
    dinner = LocalTime.of(9,00);
    out.println("Is my dinner in the past? " + dinner.isBefore(now));
    long minsToDinner = now.until(dinner, ChronoUnit.MINUTES);
    waketime = LocalTime.of(7,0);
    long hrstoWaking = dinner.until(waketime, ChronoUnit.HOURS);
    out.println("How many horurs from dinner to wake up next morning? " + hrstoWaking);
  }
}
