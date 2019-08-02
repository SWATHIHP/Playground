#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  for(int i=0;n!=0;i++)
  {
    if((i%2)==1)
    {
      n--;
      printf("%d\n",i);
    }
  } 
	return 0;
}