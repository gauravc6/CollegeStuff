#include<stdio.h>
int main()
{
    int  a[500],n,m,m2,l=0,o=0;
    printf("Enter the number of elements of the array:");
    scanf("%d",&n);
    printf("Enter the array now:");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    m=a[0];
    for(int j=0;j<n;j++)
    {
        if(a[j]>m)
        {
            m=a[j];
            l=j;
        }
    }
    printf("The largest number is %d\n",a[l]);
    m2=a[0];
       for(int s=0;s<n;s++)
    {
        if(m>a[s] && a[s]>m2)
        {
            m2=a[s];
            o=s;
        }
    }
    printf("Second largest number is %d",a[o]);
}
