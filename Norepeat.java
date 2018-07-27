package player;

import java.util.Scanner;

public class Norepeat {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the array length");
		int n=s.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the array elements");
		for (int i = 0; i < n; i++) {
			arr[i]=s.nextInt();
		}
		int m=0,c=0;
		for (int i = 0; i < arr.length; i++) {
			 c=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c==1)
			m=arr[i];
		}
	  System.out.println("\n"+ m);
	}

}
