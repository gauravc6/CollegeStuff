import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        for (int i = 0; i<(s.length()-1)/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                System.out.println("Not a palindrome.");
                System.exit(0);
            }
        }
        System.out.println("Palindrome.");
    }   
}