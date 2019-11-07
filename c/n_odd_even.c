#include<stdio.h>
int main()
{
int a[9];
int e=0,o=0;
printf("Enter 10 numbers:(Hit enter after every entry)\n");
for(int i=0;i<=9;i++)
{
scanf("%d",&a[i]);
}
for(int i=0;i<=9;i++)
{
if(a[i]%2==0)
e=e+1;
else if(a[i]%2==1)
o=o+1;
else
    printf("");
}
printf("Number of odd numbers entered is %d\n",o-1);
printf("Number of even numbers entered is %d",e+1);
return 0;
}
