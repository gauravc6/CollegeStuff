/*Question 5 - Write a program for addition of two 3x3 matrix */
#include<stdio.h>
int main()
{
int a[3][3],b[3][3],s[3][3];
int r,c;
printf("Enter elements of first matrix:\n");
for(r=0;r<3;r++)
{
for(c=0;c<3;c++)
{
    scanf("%d",&a[r][c]);
}

}
printf("Enter elements of second matrix:\n");
for(r=0;r<3;r++)
{
for(c=0;c<3;c++)
{
    scanf("%d",&b[r][c]);
}
}
for(r=0;r<3;r++)
{
for(c=0;c<3;c++)
{
    s[r][c]=a[r][c]+b[r][c];
}
}
for(r=0;r<3;r++)
{
for(c=0;c<3;c++)
{
    printf("%d \t",s[r][c]);
}
printf("\n");
}
}
