import java.util.Scanner;
class Prime{    
 public static void main(String args[]){    
  int i,m=0,flag=0;      
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();  
  m=n/2;      
  if(n==0||n==1){  
   System.out.println("no");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println("no");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println("yes"); }  
  }
}    
}