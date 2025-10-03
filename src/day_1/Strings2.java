package day_1;
import java.util.Scanner;
public class Strings2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toLowerCase();
		char ch = s.charAt(0);
		if(ch =='a' || ch =='e'|| ch =='i' || ch =='o' ||ch=='u') {
			System.out.println("vowels");
		}else {
			System.out.println("consonants");
		}
	}

}
