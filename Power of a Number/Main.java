#include <stdio.h>
int main()
{
  	//Your code here  
  long int b,a,p=1,i;
  scanf("%ld",&b);
  scanf("%ld",&a);
//  n=b^e;
  if(b==0)
  {
    p=1;
  }
  else if(b==1)
  {
    p=a;
  }
  else if(a<0)
  {
    printf("Wrong input");
  }
  else{
    
  for(i=a;i>0;i--)
  {
    p=p*b;
  }
  
    printf("%ld",p);
  }
  
    return 0;
}