import java.util.Scanner;

public class leap
{
    public static void main(String args[])
    {
       int yr;
       Scanner scan = new Scanner(System.in);
	   
       yr = scan.nextInt();
	   
       if((yr%4 == 0) && (yr%100!=0))
       {
           System.out.print("Yes");
       }
       else if((yr%100 == 0) && (yr%400 == 0))
       {
           System.out.print("Yes");
       }
       else if(yr%400 == 0)
       {
           System.out.print("Yes");
       }
       else
       {
           System.out.print("No");
       }
    }
}