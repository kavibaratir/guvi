package player;

import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String g=s.next();
		System.out.println("enter the string length");
		int n=s.nextInt();
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < n; i++) {
			if(g.charAt(i)=='a'||g.charAt(i)=='e'||g.charAt(i)=='i'||g.charAt(i)=='o'||g.charAt(i)=='u'){
				continue;
			}
			else
		sb.append(g.charAt(i));
		}
		System.out.println(sb.reverse().toString());

	}

}
