#include<stdio.h>
int main()
{
  //Type your code here
  int n,n1,n2,sum;
  scanf("%d\n",&n);
  n1=n%10;
  n2=n/100;
  sum=n1+n2;
  printf("%d",sum);
  return 0;
}