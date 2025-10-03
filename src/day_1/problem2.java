package day_1;
import java.util.*;
public class problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.println("Even number");
			}else {
				System.out.println("odd number");
			}
		}

	}

}
