#include <stdio.h>
 
int main()
{
  int c, n, fact = 1;
 
 //rintf("Enter a number to calculate its factorial\n");
  scanf("%d", &n);
 
  for (c = 1; c <= n; c++)
    fact = fact * c;
 
  printf("%d",fact);
 
  return 0;
}