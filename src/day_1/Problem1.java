package day_1;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				System.out.println("Positive number");
			}else if(arr[i]==0) {
				System.out.println("zero number");
			}else {
				System.out.println("negative number");
			}
		}
		
	}

}
