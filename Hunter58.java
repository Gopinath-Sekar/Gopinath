package hunter;

import java.util.Scanner;

public class Hunter58 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int input[]=new int[n+1];
		for(int i=0;i<n;i++)
		{
			input[i]=sc.nextInt();
		}
		sc.close();
		int diff=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if((i!=n)&&(input[i]>input[i+1]))
			{
				diff=input[i]-input[i+1];
			}
			if((i!=n)&&(input[i]<input[i+1]))
			{
				diff=input[i+1]-input[i];	
			}
			if(diff==n)
			{
				++count;
			}
		}
		System.out.println(count);
	}
}
