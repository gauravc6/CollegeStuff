import java.util.Scanner;
/*
5   5
 4 4
  3
 4 4
5   5 
*/

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if(i==j || i==n-j-1)
                    System.out.print(temp);
                else
                    System.out.print(" ");
            }
            System.out.println();
            if(i<n/2)
                temp -=1;
            else
                temp +=1;
        }    
    }   
}