
#include <stdio.h>

int main()
{
    int i, sum=0;
    for(i=1; i<20; i+=2)
    {
        sum += i;
    }

    printf("Sum of odd numbers = %d", sum);
}
