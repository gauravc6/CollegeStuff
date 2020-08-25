package Assignment;

import java.util.Scanner;


// 1st term + 2nd term + 2 = 3rd term
// 2nd term + 3rd term + 3 = 4th term 
public class SeriesGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int t1 = 3;
        int t2 = 8;
        System.out.print(t1 + " " + t2 + " ");
        for (int i=0; i<n-2; i++) {
            System.out.print(t1 + t2 + i + 2 + " ");
            int temp = t1;
            t1 = t2;
            t2 += temp + i + 2;
        }
    }
}