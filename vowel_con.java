import java.util.Scanner;
class vowel_con
{
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner a=new Scanner(System.in);
	char ch=a.next( ).charAt(0);	 
	//char ch=sc.nextChar();
	switch(ch)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
	}
	if(i==1)
	System.out.println("Vowel");
	else 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println("Consonent");
		else
		System.out.println("Invalid");		
	}
}
