package day_6;
import java.util.*;
public class Reversewords {
	 public String reverseWords(String s) {
	        if (s.isEmpty()) {
	            return "empty string";
	        }

	        String[] words = s.split("\\.");
	        StringBuilder result = new StringBuilder();

	        for (int i = words.length - 1; i >= 0; i--) {
	            result.append(words[i]);
	            if (i != 0) {
	                result.append(".");
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        Reversewords obj = new Reversewords();
	        System.out.println(obj.reverseWords(s));
	        sc.close();
	    }
	}
