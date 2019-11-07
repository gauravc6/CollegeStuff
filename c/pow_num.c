#include<stdio.h>
#include<math.h>
void main() 
{
int x,y,l;
printf("Enter the number you want to power up:");
scanf("%d",&x);
printf("Enter the number you want to power up by:");
scanf("%d",&y);
l=pow(x,y);
printf("Answer is %d.",l);

}
