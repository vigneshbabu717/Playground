#include<stdio.h>
int main()
{
  int num, sum=0, tsum=0;
  scanf("%d", &num);
  int tnum;
  tnum =num;
  while (num>0)
  {
    int a;
    a= num%10;
    num = num/10;
    sum = sum + a;
  
      }
  
  if(sum>9)
  {
    while(sum>0)
    {
    int b; 
    b= sum%10;
    sum= sum/10;
    tsum = tsum + b;
      
  }
  printf("%d", tsum);}
  else 
  {printf("%d", sum);
  }
  
}
    