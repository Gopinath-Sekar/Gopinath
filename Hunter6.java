import java.util.Scanner;
public class Hunter6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array:");
	int a[]=new int [sc.nextInt()];
	int flag=0;
	System.out.println("enter the "+a.length+" numbers into array:");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=1;j<a.length;j++)
		{
		if(a[i]==a[j] && i!=j)
		{
			flag=1;
			System.out.println("the repeated element is "+a[i]);
			break;
		}
		if(flag==1)
		{
			break;
		}
	}
	}
	if(flag==0)
	{
		System.out.println("no repeated elements");
	}
}
}
