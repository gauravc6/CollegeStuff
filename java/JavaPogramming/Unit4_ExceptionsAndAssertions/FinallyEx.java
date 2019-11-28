import static java.lang.System.out;

public class FinallyEx
{
  public static void main(String args[])
  {
    try
    {
    int val = 25/0;
    out.println(val);
  }
  catch(ArithmeticException e)
  {
    out.println("Exception caught: "+e);
  }
  finally
  {
    out.println("Finally always gets executed!");
  }
  out.println("further code flow");
}
}
