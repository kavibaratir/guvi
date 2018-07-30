package hunter;
import java.util.*;
public class ArrayIndexEvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		ArrayList u=new ArrayList ();
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0&&arr[i]%2==1) {
				u.add(arr[i]);
			}
			if(i%2==1&&arr[i]%2==0) {
				u.add(arr[i]);
			}
		}
		System.out.println(u);
	}

}
