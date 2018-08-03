package beginers;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		if(a>=65&&a<=90||a>=97&&a<=122) {
			System.out.println("Alphabet");
		}
		else
			System.out.println("no Alphabet");
	}

}
