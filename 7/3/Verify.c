#include <stdio.h>

int main(void)
{


	int x = 10 ;
	int y = 20 ;
		
	int ans = ++x + y++ + x++;
	printf("%d",ans);

}