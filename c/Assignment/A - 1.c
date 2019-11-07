/*Question 1 - Write a program to copy the contents of one array into another in the reverse order.*/
#include<stdio.h>
#include<string.h>
int main() 
{
    int x;
printf("Choose an iteration to run:\n");
printf("1. Reverse an integer array.\n");
printf("2. Reverse a character array(i.e. a string).\n");
scanf("%d",&x);
switch(x)
{
case 1:
    printf("***Integer array iteration chosen***\n");
    int a[100],n;
    printf("Enter number of array elements to be entered:\n");
    scanf("%d",&n);
    printf("Enter the array:\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Reverse of the array is:\n");
    for(int i=n-1;i>=0;i--)
    {
        printf("%d ",a[i]);
    }
    break;
case 2:
    printf("***String iteration chosen***\n");
    char l[100];
    printf("Enter a string:");
    scanf("%s",&l);
    printf("Reverse of the string entered is %s.",strrev(l));
    break;
default:
    printf("Inalid input\n");

}
}
