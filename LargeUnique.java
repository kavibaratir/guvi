package hunter;

import java.util.*;

public class LargeUnique {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		int brr[]=new int[arr.length];
		Arrays.sort(arr);
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			brr[j++]=arr[i];
			}
	   int sum=0;int f=0;
	for (int i = 0; i < brr.length; i++) {
		f=f+brr[i];
		if(f==0) {
		System.out.println(0);
		break;
		}
		else
		System.out.println(brr[i]);
	}
		
		
	}

}
