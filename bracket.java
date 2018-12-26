
import java.util.Scanner;

 class bracket {
	



	
		// Method to find an equal index 
		static String findIndex() 
		{  
			Scanner obj=new Scanner(System.in);
			String input=obj.nextLine();
		    String result = ""; 
	        char firstChar = input.charAt(0);
	        //for (int i = 1; i < input.length(); i++)
	       // {
	        	char currentChar = '(';
	            char previousChar = ')';
	        	   if (previousChar == '('&& currentChar==')')
	        	   {
	        		   System.out.println("no");
	               } else {
	            	   System.out.println("yes");
	               }
	        	   
	        //}
			//System.out.println(a);
			return result;
		} 
		
		// Driver Method 
		public static void main(String[] args) 
		{  
			bracket obj=new bracket();
			obj.findIndex();
			//String str = "(()))(()()())))"; 
			 
		} 
	 

	
}
