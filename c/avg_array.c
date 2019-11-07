#include<stdio.h>
void main() 
{
int a[100],n,j;
float sum=0;
float avg;
printf("Enter number of elements in the array:");
scanf("%d",&n);
printf("Enter numbers in the array:");
for(int i=0;i<n;i++)
{
scanf("%d",&a[i]);
sum=sum+a[i];
}
avg=sum/n;
printf("Average of the array is %f",avg);
}
