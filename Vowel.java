package beginers;
import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		if(a=='a'&&a=='e'&&a=='i'&&a=='o'&&a=='u') {
			System.out.println("vowel");
		}
		else
			System.out.println("constant");
	}

}
