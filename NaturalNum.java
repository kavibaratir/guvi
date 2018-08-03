package beginers;

import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();int sum=0;
	for (int i = 0; i <=a; i++) {
		sum+=i;
	}System.out.println(sum);
	}

}
