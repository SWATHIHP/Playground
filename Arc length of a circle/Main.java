#include<stdio.h>
#include<math.h>
int main()
{
  float r,theta,arc;
  scanf("%f",&r);
  scanf("%f",&theta);
  arc=(2*3.14*r)*((theta)/360);
  printf("%.2f",arc);
  return 0;
}