#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,n1,n2;
  scanf("%d",&n);
  n1=n%10;
  while(n>10)
  {
     n=n/10;
  }
  n2=n%10;
  sum=n1+n2;
  printf("%d",sum);
	return 0;
}