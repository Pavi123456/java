import java.util.Scanner;

public class Digit {
	private static Scanner a;
	
	public static void main(String[] args) {
		int Number, Count=0;
		a= new Scanner(System.in);		
	
		Number = a.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.print( Count);
	}
}