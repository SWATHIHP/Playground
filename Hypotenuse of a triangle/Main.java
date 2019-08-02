#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float ab,bc,a,b;
  float ca;
  scanf("%f %f",&ab,&bc);
  a=ab*ab;
  b=bc*bc;
  ca=sqrt(a+b);
  printf("%0.2f",ca);
  return 0;
}