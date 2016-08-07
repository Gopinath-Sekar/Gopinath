package pro;

import java.util.Scanner;

/**
 *
 * @author R.AADHAVAN
 */
public class pro4 {

    /**
     * @param args the command line arguments
     */
    public static String main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("ENETR YOUR STRING=\n");
        
        str=sc.nextLine();
     if (str.length() <= 1) return str;
  
  String mid = str.substring(1, str.length()-1);
  System.out.println(" YOUR STRING=\n" +mid);
  
  // last + mid + first
  return str.charAt(str.length()-1) + mid + str.charAt(0);
       
    }
}