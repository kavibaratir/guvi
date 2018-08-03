package pro;

import java.math.BigInteger;
import java.util.*;

public class DeleteDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
	BigInteger a=sc.nextBigInteger();
	System.out.println("enter the numbers to delete");
	int b=sc.nextInt();
	String s=a.toString();
	String res=s.substring(b);
	System.out.println(res);
	

	}

}
