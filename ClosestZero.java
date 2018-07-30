package hunter;

import java.util.Scanner;

public class ClosestZero {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
	for (int i = 0; i < arr.length; i++) {
		for (int k = i+1; k < arr.length; k++) {
			if(arr[i]+arr[k]==0) {
				System.out.println(arr[i]+" "+arr[k]);
			}
		}
		
	}
	}

}
