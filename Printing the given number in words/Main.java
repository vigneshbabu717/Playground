#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  switch(a)
  {
    case 1: printf("ONE %d"); break;
    case 2: printf("Two %d"); break;
    case 3: printf("Three"); break;
    case 4: printf("four %d"); break;
    case 5: printf("five "); break;
    default: printf("Invalid ");
  }
  return 0;
}