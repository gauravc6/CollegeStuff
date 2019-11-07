#include<stdio.h>
int main()
{
int a,b;
printf("Enter number whose multiplication table is required and the no. of iterations wanted:");
scanf("%d %d",&a,&b);
for(int i=1;i<=b;i++)
{
printf("%d x %d = %d\n",i,a,i*a);
}
}
