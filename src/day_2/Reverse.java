package day_2;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int result=0;
		while(n!=0) {
			int d=n%10;
			result=result*10+d;
			n= n/10;
		}
		System.out.println(result);

	}

}
