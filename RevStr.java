import java.util.Scanner;

public class RevStr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String e="";
		for(int i=a.length()-1;i>=0;i--) {
			e=e+a.charAt(i);
		}
		System.out.println(e);
	}

}