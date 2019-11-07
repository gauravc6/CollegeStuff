/*Question 2 - Twenty-five numbers are entered from the keyboard into an array. Write a program to
find out how many of them are positive, how many are negative, how many are even and
how many odd. */
#include<stdio.h>
int main() 
{
int a[25];
int p=0,q=0,r=0,s=0,t=0;
printf("Enter list of numbers:\n");
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
if(a[i]%2==0)
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
