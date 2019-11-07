/*Question 3 - Twenty-five numbers are entered from the keyboard into an array. The number to be
searched is entered through the keyboard by the user. Write a program to find if the
number to be searched is present in the array and if it is present, display the number of
times it appears in the array. */
#include<stdio.h>
int main() 
{
int a[25],q,c=0;
printf("Enter elements:");
for(int i=0;i<25;i++)
{
scanf("%d",&a[i]);
}
printf("Enter the number to be searched:");
scanf("%d",&q);
for(int j=0;j<25;j++)
{
    if(a[j]==q)
     c++;
        }
if(c>0)
    printf("Yes, the number is present in the array.\nNumber %d is present %d times in the array.",q,c);
    else
        printf("No, the entered number is not present in the array.");


}
