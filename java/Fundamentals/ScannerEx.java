import java.util.Scanner;
public class ScannerEx
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = sc.nextLine();
    System.out.println("Enter your gender:(Male/Female)");
    char gen = sc.next().charAt(0);
    System.out.println("Enter marks of 3 subjects:");
    int m1 = sc.nextInt();
    int m2 = sc.nextInt();
    int m3 = sc.nextInt();
    double avg = (m1+m2+m3)/3.0;
    System.out.println("Your name is: "+name);
    System.out.println("Gender: "+gen);
    System.out.println("Average marks: "+avg);
  }
}
