import java.util.Scanner;
 class TestIsomorphic {
      public static void main(String[] args) {
            String str1;
            String str2;
            String str;
		
	 Scanner scan = new Scanner(System.in);
	 str1= scan.nextLine();
	 str2= scan.nextLine();
            boolean res = TestIsomorphic.checkIsomorphic(str1,str2);
            System.out.println(res);
      }

      static boolean checkIsomorphic(String str1, String str2) {
            int length = str1.length();
            /* length of both strings must be same */
            if (length != str2.length()) {
                  return false;
            }

            // To mark visited characters in str2
            char visited[] = new char[26];
            for (int i = 0; i < visited.length; i++) {
                  visited[i] = '#';
            }

            char[] strArr1 = str1.toCharArray();
            char[] strArr2 = str2.toCharArray();

            // Process all characters one by on
            for (int i = 0; i<length; i++) {
                  char ch = visited[strArr1[i]-'a'];
                  if(ch=='#') {
                        visited[strArr1[i]-'a'] = strArr2[i];
                  } else if (ch != strArr2[i]) {
                        return false;                      
                  }
            }
            return true;
      }
}import java.util.Scanner;
public class TestIsomorphic {
      public static void main(String[] args) {
            String str1;
            String str2;
            String str;
		
	 Scanner scan = new Scanner(System.in);
	 str1= scan.nextLine();
	 str2= scan.nextLine();
            String res = TestIsomorphic.checkIsomorphic(str1,str2);
            System.out.println(res);
      }

      static String checkIsomorphic(String str1, String str2) {
            int length = str1.length();
            /* length of both strings must be same */
            if (length != str2.length()) {
                  return "no";
            }

            // To mark visited characters in str2
            char visited[] = new char[26];
            for (int i = 0; i < visited.length; i++) {
                  visited[i] = '#';
            }

            char[] strArr1 = str1.toCharArray();
            char[] strArr2 = str2.toCharArray();

            // Process all characters one by on
            for (int i = 0; i<length; i++) {
                  char ch = visited[strArr1[i]-'a'];
                  if(ch=='#') {
                        visited[strArr1[i]-'a'] = strArr2[i];
                  } else if (ch != strArr2[i]) {
                        return "no";                      
                  }
            }
            return "yes";
      }
}