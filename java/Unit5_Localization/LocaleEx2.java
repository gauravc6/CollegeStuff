import java.util.*;

public class LocaleEx2{
  public static void main(String[] args) {
    List<Locale> locales = new ArrayList<Locale>();
    locales.add(new Locale("en","US"));
    locales.add(new Locale("es","ES"));
    locales.add(new Locale("it","IT"));
    locales.add(new Locale("hi","IN"));

    for (Locale x:locales) {
      String dispLang = x.getDisplayLanguage(x);
      System.out.println(x.toString()+": "+dispLang);
    }
  }
}
