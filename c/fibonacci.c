#include<stdio.h>
int main() 
{
int t1=0,t2=1,n,i,f=0;
printf("Enter how long the fibonacci series must be:");
scanf("%d",&n);
for(i=0;i<=n;++i)
{
printf("%d ",t1);
f=t1+t2;
t1=t2;
t2=f;

}
printf("");
}
