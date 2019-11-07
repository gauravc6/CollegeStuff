#include<stdio.h>
int main() 
{
    int i,j,n;
    char a;
    printf("Enter a number to print square matrix:");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            printf("\t#");

        } printf("\n");
    }
}
