#include<stdio.h>
int main ()
{
int a[9];
printf("Enter 10 integers:(Hit enter after entering a single digit)\n");
for(int i=0;i<=9;i++)
{
scanf("%d",&a[i]);
}
printf("\nPrinting numbers in a single line:\n");
for(int i=0;i<=9;i++)
{
printf("%d ",a[i]);
}
printf("Printing numbers in a individual line:\n");
for(int i=0;i<=9;i++)
{
printf("%d\n",a[i]);
}
return 0;
}
