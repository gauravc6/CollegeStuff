package Assignment;

import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
    
        System.out.println(n*(n-1)/2);
    }
}