package beginers;

import java.util.Scanner;

public class PrintStr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String g=s.next();
		int y=s.nextInt();
				
		for(int i=0;i<y;i++) {
			System.out.println(g);
		}
	}

}
