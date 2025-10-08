package day_4;

import java.util.Arrays;
import java.util.Scanner;

public class Reverseastring {
	public void reverseString(char[] s) {
		int left=0,right=s.length-1;
		while(left<right) {
		char temp=s[left];
		s[left]=s[right];
		s[right]=temp;
		left++;
		right--;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			char[] s = str.toCharArray();
			Reverseastring obj = new Reverseastring();
			obj.reverseString(s);
			System.out.println(Arrays.toString(s));
		
	}

}
