import java.util.Scanner;
import static java.lang.System.out;

class Assertions
{
  public void check(int hr)
  {
    assert hr!=12: "You cannot check in now!";
    out.println("Current time is: "+hr);
  }

  public static void main(String args[])
  {
    Assertions obj = new Assertions();
    Scanner sc = new Scanner(System.in);
    out.println("Enter current time:");
    int val = sc.nextInt();
    obj.check(val);
  }
}
