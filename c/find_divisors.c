#include<stdio.h>
int main()
{
int a;
printf("Enter a number to get the divisors:");
scanf("%d",&a);
printf("The divisors are:");
for(int i=1;i<=a;i++)
{
    if(a%i==0)
        printf(", %d",i);
        else
            printf("");
}
return 0;
}

