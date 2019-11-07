#include<stdio.h>
#include<string.h>
void main() 
{
char a[100];
printf("Enter a string to convert to upper case:");
scanf("%s",&a);
printf("Upper case string is %s",strupr(a));
}
