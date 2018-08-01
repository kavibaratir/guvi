package hunter;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String a=s.nextLine();
		String ss[]=a.split(" ");
		for(int i=0;i<ss.length;i++) {
			char ch[]=ss[i].toCharArray();
			for (int j = ch.length-1; j >=0; j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
			
		}
        	
		
		
	}

}
