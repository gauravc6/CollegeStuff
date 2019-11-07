/*Question 4 - Write a program to find if a square matrix is symmetric */
#include<stdio.h>
int main()
{
int a[100][100],b[100][100];
int size,r,c,sym;
printf("Enter size of matrix:\n");
scanf("%d",&size);
printf("Enter elements of the matrix:\n");
for(r=0;r<size;r++)
{
for(c=0;c<size;c++)
{
    scanf("%d",&a[r][c]);
}
}
printf("Entered matrix is as follows:\n");
for(r=0;r<size;r++)
{
for(c=0;c<size;c++)
{
    printf("%d \t",a[r][c]);
}
printf("\n");
}
for(r=0;r<size;r++)
{
    for(c=0;c<size;c++)
    {
        b[r][c]=a[c][r];
    }
}
sym=1;
for(r=0;r<size && sym;r++)
{
    for(c=0;c<size;c++)
    {
        if(a[r][c]!=b[r][c])
        {
            sym=0;
        }
    }
}
if(sym==1)
    printf("The entered matrix is symmetrical.");
else
    printf("The entered matrix is unsymmetrical.");
}
