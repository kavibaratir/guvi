package hunter;

import java.util.Scanner;

public class FirstRepeat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int arr[]= new int[a];
		for (int i = 0; i < arr.length; i++) {
		    arr[i]=s.nextInt();	
		}
		int c=0,res=0;
		in:for (int i = 0; i < arr.length; i++) {
			c=0;
			for (int j = i; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c==2) {
				res=arr[i];
				break in;
			}
		}
		System.out.println(res);
	}

}
