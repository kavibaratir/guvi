package beginers;

import java.util.Scanner;

public class ArrSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("enter the no of elements to sum");
		int r=s.nextInt();
		int sum=0;
		for (int i = 0; i <r; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
