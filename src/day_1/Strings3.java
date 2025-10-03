package day_1;
import java.util.*;
public class Strings3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		if(s.length()>5) {
			System.out.println("length is greater than 5");
		}else if( s.length()==5) {
			System.out.println("length is equals to 5");
			
		}else {
			System.out.println("length is less than 5");
		}

	}

}
