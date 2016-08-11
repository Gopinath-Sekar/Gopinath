package pro;
import java.util.Scanner;
public class Pro52 {
	public static void main(String args[])
	{
		 String output;
         Scanner in=new Scanner(System.in);
         int x1=in.nextInt();
         int y1=in.nextInt();
         int x2=in.nextInt();
         int y2=in.nextInt();
         int x3=in.nextInt();
         int y3=in.nextInt();
         int x4 = in.nextInt();
         int y4=in.nextInt();
         if(x1==x4 && x2==x3&&y3==y4&&y1==y2)
         {
        	 if(x2-x1==y3-y2)
        		 
        	 {
	        System.out.println("The points form a square");
         }
         else
         {
	        System.out.println("The given points does't form a square");
         }
         }
         else
         {
        	 System.out.println("The given points does't form a square");
         }
	}
}

