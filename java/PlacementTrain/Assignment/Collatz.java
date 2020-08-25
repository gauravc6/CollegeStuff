package Assignment;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.print(n + " ");
        while (n != 1) {
            if (n%2 == 0)
                n = n/2;
            else
                n = 3*n+1;
            System.out.print(n + " ");
        }
    }
}