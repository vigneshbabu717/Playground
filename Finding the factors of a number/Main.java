#include <stdio.h>
int main() {
	int n;
  scanf("%d", &n);
  for(int i=1; i<=n; i++)
  {
    int div=0;
    if(n%i ==0)
    {
      printf("%d", i);
      printf("\n");
    }
  }
	return 0;
}