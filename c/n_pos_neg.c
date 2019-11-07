#include<stdio.h>
int main() //Gaurav Chandiramani 18BCE10099
{
int a[25]; //program for 25 different numbers.
int p=0,q=0,r=0,s=0,t=0;
printf("Enter list of numbers:(Separate no.s using enter key)\n");
for(int i=0;i<=24;i++)
{
scanf("%d",&a[i]);
}
for(int i=0;i<=24;i++)
{
if(a[i]>0)
p++;
else if(a[i]<0)
q++;
else
r++;
}
for(int j=0;j<=24;j++)
{
if(a[j]%2==0)
s++;
else
t++;
}
printf("Number of +ve numbers is %d\n",p);
printf("Number of -ve numbers is %d\n",q);
printf("Number of 0's are %d\n",r);
printf("Number of even numbers is %d\n",s);
printf("Number of odd numbers is %d\n",t);
}
