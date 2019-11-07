#include<stdio.h>
int main()
{
    int mult=1,sum=0,x,y;
    printf("Enter a no.:");
    scanf("%d",&x);
    for(;x!=0;x/=10)
    {
        y=x%10;
        mult*=y;
        sum+=y;
    }
    if(sum=mult)
        printf("A spy number");
    else
    printf("Not a spy number");
	printf("");
}
