package player;

import java.util.Scanner;

public class MostRepeatchar {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the string");
		String n=s.next();
		int c=0,max=0;
		char res=' ';
		for(int i=0;i<n.length();i++) {
			for (int j = i+1; j < n.length(); j++) {
				if(n.charAt(i)==n.charAt(j)) {
					c++;
				}
				if(max<c) {
					max=c;
					res=n.charAt(i);
				}
			}
		}
		System.out.println(res);
	}

}
