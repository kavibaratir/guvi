package hunter;
import java.util.*;
public class LargestNumK {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
				int temp=0;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			  }
			}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n"+arr[n-k]);
	}

}
