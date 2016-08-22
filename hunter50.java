package hunter;

import java.util.Scanner;
class Division
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt(); 
        sc.close();
        int quotient=0;
        while(num1>=num2)
        {
          num1=num1-num2;
          quotient++;
        }
        System.out.println("Quotient is "+quotient);
        System.out.println("Remainder is " +num1);
    }
}
