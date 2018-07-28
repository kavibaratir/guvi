package hunter;

import java.util.*;

public class Equalindex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		TreeSet t=new TreeSet();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==i) {
				t.add(i);
			}
		}
		if(t.size()!=0) {
		System.out.println(t);
		}
		else
			System.out.println(-1);
	}

}
