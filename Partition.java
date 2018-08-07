package pro;
import java.util.*;
public class Partition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number for partition");
		int n=s.nextInt();
		System.out.println("enter the 2 numbers of partition");
		int k=s.nextInt();
		int b=s.nextInt();
		int a=n/2;
		int sum=0,j=0;
		System.out.println(a);
		while(sum!=a) {
			sum+=k;
			sum+=b;
			j++;
			if(sum>=a) {
				break;
			}
	
		}
		if(sum==a&&j==2) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
			
	}

}
