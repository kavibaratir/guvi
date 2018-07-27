package player;
import java.util.*;
public class FactorPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		ArrayList <Integer> arr=new ArrayList<Integer>();
		ArrayList <Integer> res=new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				arr.add(i);
				}
		     }
		System.out.println(arr);
		int count=0;
		for(int i=0;i<arr.size();i++) {
			count=0;
			for(int j=1;j<=arr.get(i);j++) {
				if(arr.get(i)%j==0) {
					count++;
				}
			}
			if(count==2) {
				res.add(arr.get(i));
			}
		}
		System.out.println(res);
	}

}
