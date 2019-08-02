#include <stdio.h>
int main() 
{
  char c;
  scanf("%c",&c);
  if('a' <= c && 'z' >= c)
  {
    printf("%c",c-32);
  }
  else if('A' <= c && 'Z' >= c)
  {
    printf("%c",c+32);
  }

  
	return 0;
}