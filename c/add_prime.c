#include <stdio.h>

int main()
{
    int i, j, ifP, sum=0;

    for(i=2; i<=100; i++)
    {

        ifP = 1;
        for(j=2; j<=i/2 ;j++)
        {
            if(i%j==0)
            {
                ifP = 0;
                break;
            }
        }
        if(ifP==1)
        {
            sum += i;
        }
    }

    printf("Sum of all prime numbers between 1 to 100 = %d", sum);
}
