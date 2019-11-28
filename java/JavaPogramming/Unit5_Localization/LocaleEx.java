import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocaleEx{
  public static void main(String[] args) {
    LocalDateTime today = LocalDateTime.now();
    Locale loc = Locale.GERMANY;

    DateTimeFormatter dt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)
    .withLocale(loc);
    System.out.println("Today's date: "+today.format(dt)
    +" Local: "+loc.toString());
  }
}
