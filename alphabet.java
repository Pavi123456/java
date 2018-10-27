import java.util.Scanner;

public class alphabet
{
    public static void main(String args[])
    {
        char ch;
        Scanner a = new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        ch = a.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(" Alphabet");
        }
        else
        {
            System.out.print("No");
        }
    }
}