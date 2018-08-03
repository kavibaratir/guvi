package beginers;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Boolean b=true;
		if(a%4==0) {
		b=true;
		if(a%100==0) {
			if(a%400==0) {
				b=true;
			}
			else
				b=false;
		}
		else
			b=true;
		}
		else
			b=false;
		if(b) {
			System.out.println("leap");
		}
		else
			System.out.println("no leap");
		s.close();
		}
	

}
