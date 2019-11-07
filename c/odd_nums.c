#include<stdio.h>
int main()
{
int a;
printf("Enter a number:");
scanf("%d",&a);
printf("All odd numbers till %d are:",a);
for(int i=1;i<=a;i++)
{
if(i%2==1)
printf(", %d",i);
else
printf("");
}
}
