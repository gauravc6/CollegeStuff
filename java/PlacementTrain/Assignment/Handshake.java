package Assignment;

import java.util.Scanner;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int handshakes = 0;
        for (int i=0; i<n; i++) {
            handshakes += i;
        }
        System.out.println(handshakes);
    }
}