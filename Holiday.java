import java.util.Scanner;
 class Holiday 
{
  public static void main(String[] args)
  {
            Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
    String dayString;
    switch (input) {
    case "Sunday":
      System.out.println("yes");
    break;
  
     case "Saturday":
      System.out.println("yes");
    break;
  
    case "Monday":
      System.out.println("no");
    break;
  
    case "Tuesday":
      System.out.println("no");
    break;
  
    case "Wednesday":
      System.out.println("no");
    break;
  
    case "Thursday":
  System.out.println("no");
    break;
    
    case "Friday":
        System.out.println("no");
    break;
    default:   System.out.println("it is not a day.You enter like something wrong");
    break;
    
   }
}
}