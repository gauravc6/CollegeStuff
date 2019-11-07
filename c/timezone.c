#include<stdio.h>
void main()
{
int h1,m1,s1,h2,m2;
printf("Enter desired time to be converted:");
scanf("%d:%d:%d",&h1,&m1,&s1);
h2=h1+5;
m2=m1+30;
if(h2>23)
h2=h2-24;
else if(h2>23 && m2>59)
{
h2=h2-24;
m2=m2-60;
}
else if(m2>59)
m2=m2-60;
else
printf("\n");
printf("Time in IST will be %d:%d:%d",h2,m2,s1);
}
