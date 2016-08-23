package hunter;

import java.util.Scanner;

public class Hunter85 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int k=1;
		int input[]=new int[n];
		for(int i=0;i<n;i++)
		{
			input[i]=k++;
		}
		int num=0;
		int count=0;
		for(int i=0;i<n;i++){
			while(input[i]>0)
			{
				num=input[i]%10;
				input[i]/=10;
				if(num==2)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
