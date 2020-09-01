package Assignment;

import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int num = n * n;
        int len = String.valueOf(n).length();
        
        int sum = (int) (num/Math.pow(10, len) + num%Math.pow(10, len));
        if (sum == n)
            System.out.println("Kaprekar Number.");
        else
            System.out.println("Not a Kaprekar Number.");
    }
}