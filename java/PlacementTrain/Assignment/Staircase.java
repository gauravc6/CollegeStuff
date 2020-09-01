package Assignment;

import java.util.Scanner;

// 1 -> 1
// 2 -> 2
// 3 -> 4
// 5 -> 8
// 6 -> 13
// 7 -> 21
public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(countWays(n+1));
    }

    //recursive fibonacci
    public static int countWays(int n) {
        if (n <= 1)
            return n;
        return countWays(n-1) + countWays(n-2);
    }
}