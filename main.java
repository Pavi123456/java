
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int a;
		 Scanner in = new Scanner(System.in);
		
     
    a = in.nextInt();
        if(a > 0)
        {
            System.out.println(a+" is a positive number");
        }
        else if(a < 0)
        {
            System.out.println(a+" is a negative number");
        }
        else
        {
            System.out.println(a+" is neither positive nor negative");
        }
    }
}
