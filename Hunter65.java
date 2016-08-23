package hunter;
import java.util.Scanner;
public class Hunter65 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int noOfElements=sc.nextInt();
	int input[]=new int[noOfElements];
	System.out.println("enter "+noOfElements+" numbers into array ");
	for(int i=0;i<noOfElements;i++)
	{
		input[i]=sc.nextInt();
	}
	int num=sc.nextInt();
	sc.close();
	System.out.println("the output array after deleting given number ("+num+") is ");
	for(int i:input)
	{
		if(num !=i )
		{
			System.out.print(i+" ");
		}
	}
}
}
