import java.util.*;
import java.lang.Math;
class Pro_24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ip = n;
        int a[]=new int[10000];
        int c[]=new int[10000];
        String b[]=new String[10000];
        n=(int)Math.pow(2,ip);
        for(int i=0;i<n;i++){
            a[i]=i;
                        int temp = i;
            int count =0;
            while(temp>0){
                int j=temp%2;
                if(j==1){
                    count++;
                }
                temp=temp/2;
            }
            c[i]=count;
            b[i]=Integer.toBinaryString(a[i]);
            for(int l=0;b[i].length()<ip;l++){
                b[i]="0"+b[i];
            }
            
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n-j-1;i++){
                if(c[i]==c[i+1]){
                    if(a[i]>a[i+1]){
                        int tempc = c[i];       int tempa = a[i];     String temps = b[i];
                    c[i]=c[i+1];                a[i] = a[i+1];    b[i] = b[i+1];
                    c[i+1]=tempc;                a[i+1] = tempa;   b[i+1] = temps;
                    }
                }
                else if(c[i]>c[i+1]){
                    int tempc = c[i]; int tempa = a[i];     String temps = b[i];
                    c[i]=c[i+1];      a[i] = a[i+1];        b[i] = b[i+1];
                    c[i+1]=tempc;      a[i+1] = tempa;       b[i+1] = temps;
                }
            }
        }
        for(int i=0;i<n;i++)
            System.out.println(b[i]);
    }
}
