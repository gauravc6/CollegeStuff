#include<stdio.h>
int main()
{
int a[5][5];
printf("Enter matrix:");
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
scanf("%d",&a[i][j]);
}
}
for(int n=0;n<5;n++)
{
    printf("\n");
for(int m=0;m<5;m++)
{
printf("%d  ",a[n][m]);
}

}}
