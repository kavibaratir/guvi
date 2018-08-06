package pro;
import java.util.*;
public class Minicost {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		int c=b.length()-a.length();
	    for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)==b.charAt(i)) {
				
			}
			else
				c++;
		}
		System.out.println(c);
		
		
		
	}

}
