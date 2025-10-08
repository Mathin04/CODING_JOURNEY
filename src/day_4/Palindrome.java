package day_4;
import java.util.Scanner;
public class Palindrome {
	public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);

            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();  
	    if (checkPalindrome(str)) {
	        System.out.println("yes");
	    } else {
	        System.out.println("no");
	    }
	    sc.close();
	}
    }



