package hunter;
import java.util.*;
public class ReaptNum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,3,2,4,5};
		int n=arr.length;
		TreeSet <Integer> a=new TreeSet <Integer> ();
		int c=0,c1=0;
		for (int i = 0; i < arr.length; i++) {
			c=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c>1) {
				a.add(arr[i]);
			}
		}
		System.out.println(a);
	}

}
