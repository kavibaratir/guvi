import java.util.Scanner;

public class NumRev {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		String e="", g=Integer.toString(n);
		for (int i = g.length()-1; i>=0; i--) {
			e=e+g.charAt(i);
		}
		System.out.println(Integer.parseInt(e));
	}
