#include<stdio.h>
int main()
{
int a;
float f;
char c;
printf("Enter the inputs for integer/float/char");
scanf("%d %f %c",&a,&f,&c);
printf("Size of integer is %d, float is %d and char is %d",sizeof(a),sizeof(f),sizeof(c));
return 0;
}
