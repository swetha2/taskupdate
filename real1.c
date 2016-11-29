#include<stdio.h>
int main()
{
 int s[50],x,i,n,j;
 
 printf("enter n\n");
 scanf("%d",&n);
 printf("enter the sorted set of real numbers\n");
 for(i=0;i<n;i++)
  scanf("%d", &s[i]);
 printf("enter the x\n");
 scanf("%d",&x);
 i=0;
 j=n-1;
while(i<j)
 {
   if((s[i]+s[j])==x)
    {
      printf("the sum of %d and %d is equal to %d\n",s[i],s[j],x);
      return 1;
    }
 else if((s[i]+s[j])<x)
        i++;
 else
        j--;
}

 if(i==n || j==0)
  printf(" there are no two numbers whose sum is equal to %d\n",x);
return 0;
}
