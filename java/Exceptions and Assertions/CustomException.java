import static java.lang.System.out;

class InvalidCheckinTimeException extends Exception
{
  InvalidCheckinTimeException(String s)
  {
    super(s);
  }
}
class CustomException
{
  static void checkin(int hr)throws InvalidCheckinTimeException
  {
    if(hr!=12)
    throw new InvalidCheckinTimeException("Invalid checkin time.");
    else
    out.println("Welcome to the hotel.");
  }

  public static void main(String args[])
  {
    try
    {
      checkin(11);
    }
    catch(Exception e)
    {
      out.println("Exception hit: "+e);
    }
    out.println("Flow of code");
  }
}
