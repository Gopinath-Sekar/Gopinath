package pro;
import java.util.*;
public class pro1
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,j;
n=sc.nextInt();
String a[]=new String[100];
for(int i=0;i<n;i++)
{
a[i]=sc.next();
}
String ln = null,check;
if(a.length>0)
ln=a[0];
for(int i=1;i<a.length;i++)
{
check=a[i];
for(j=0;j<Math.min(ln.length(),a[i].length());j++)
{
if(ln.charAt(j)!=check.charAt(j))
break;
}
ln=a[i].substring(0,j);
}
System.out.println("longest prefix is:"+ln);
}
}