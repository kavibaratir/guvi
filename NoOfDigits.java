package beginers;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=0,q=0;
		while(n!=0) {
			r=n%10;
			q++;
			n=n/10;
		}
		System.out.println(q);
	}

}
