package player;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String ss=s.next();
		String g[]= {"monday","tuesday","wednesday","thrusday","friday","saturday","sunday"};
		ss.toLowerCase();
		
			if(g[5].equals(ss)||g[6].equals(ss)) {
				System.out.println("yes holiday");
			}
			else
				System.out.println("no holiday");
		
	}

}
