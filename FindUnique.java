package hunter;

import java.util.*;

public class FindUnique {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		int u=0;
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}}
			if(count==1) {
				u=arr[i];}}
		System.out.println(u);
		
	}

}
