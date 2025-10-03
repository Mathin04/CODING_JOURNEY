package day_3;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=9;
		int j;
		for(int i=0;i<=n;i++) {
			for(j=1;j<=i+1;j++) {
				System.out.print("*");
					}
			if(j == n/2) {
				for(int j1=n/2;j1<=1;j1--) {
					System.out.println("*");
				}
			}
			System.out.println();
			
		}

	}

}
