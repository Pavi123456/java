package arrays.java;

import java.util.Scanner;

class Array_NUM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int flag=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==k)
				{
					System.out.print("YES");
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		if(flag!=1)
		{
			System.out.print("NO");
		}
		sc.close();
	}
}
