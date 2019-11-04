import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import static java.lang.System.out;

public class ZoneEx
{
  public static void zoned()
  {
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");

    String formCurrectDate = date.format(form1);
    out.println("Formatted current date and time is: " + formCurrectDate);

    ZonedDateTime currentZone = ZonedDateTime.now();
    out.println("The current time zone is: " + currentZone.getZone());

    ZoneId paris = ZoneId.of("Europe/Paris");
    ZonedDateTime parisZone = currentZone.withZoneSameInstant(paris);
    out.println("Paris time zone is: " + parisZone);

    String formatedDateTime = parisZone.format(form1);
    out.println("Formatted paris timezone is: "+ formatedDateTime);
  }

  public static void main(String[] args)
  {
    zoned();
  }
}
