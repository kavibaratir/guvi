package player;

import java.util.Scanner;

public class RightShift {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the array length");
		int arrin=s.nextInt();
		System.out.println("enter the elements of array");
		int arr[]=new int[arrin];
		for(int i=0;i<arrin;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("enter the rotation count");
		int oo=s.nextInt();
		
		for(int k=0;k<=oo;k++) {
			int temp=arr[arrin-1];
		for(int i=arrin-2;i>=0;i--) {
			arr[i+1]=arr[i];
		  }
	    arr[0]=temp;
	  }
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
