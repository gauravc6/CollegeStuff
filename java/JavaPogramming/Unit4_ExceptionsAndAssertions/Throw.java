import static java.lang.System.out;

public class Throw
{
  static void checkin(int hr)
  {
    if(hr!=12)
      throw new ArithmeticException("Can't check in!");
    else
      out.println("Welcome to the hotel.");
  }
  public static void main(String args[])
  {
    try{checkin(11);}
    catch(Exception e)
    {
      out.println("Error found: "+e);
    }
    out.println("Continue code flow.");
  }
}
