import static java.lang.System.out;

public class MultiExcept
{
  public static void main(String args[])
  {
    try
    {
      int a[]=new int[10];
      a[9]=30/0;
    }
    catch(Exception e)
    {
      out.println("Exception caught: " +e);
    }
    catch(ArithmeticException e)
    {
      out.println("ArithmeticException caught: "+e);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      out.println("ArrayIndexOutOfBoundsException caught:"+e);
    }
    out.println("Executes further.");
  }
}
