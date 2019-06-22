#include <stdio.h>
int main() {
	int num,sol=1;
  scanf("%d", &num);
  for(int i=1; i<=num; i++)
  {
    sol=sol*i;
  }
  printf("%d",sol);
	return 0;
}