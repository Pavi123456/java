#include <stdio.h>
int main(void) {
   int i,j,m[10],n,temp;
   scanf("%d",&n);
   for(i=0;i<n;i++)
   {
   	scanf("%d",&m[i]);
   }
   for(i=0;i<=n;i++)
   {
   	for(j=i+1;j<n;j++)
   	{
   		if(m[i]<m[j])
   		{
   			temp=m[i];
   			m[i]=m[j];
   			m[j]=temp;
   		}
   	}
   	
   }
   for(i=0;i<n;i++)
   	printf("%d",m[i]);
 return 0;
}
