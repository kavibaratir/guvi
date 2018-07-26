package player;

import java.util.Scanner;

public class UpLow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String a=s.nextLine();
		//String g[]=a.split(" ");
		String sb="";
		if(Character.isLowerCase(a.charAt(0)))
			sb+=(Character.toUpperCase(a.charAt(0)));
		for(int i=1;i<a.length();i++) {
		if(a.charAt(i)==' '){
				sb+=" ";
				sb+=Character.toUpperCase(a.charAt(i+1));
				i++;
			}
			
		else if(Character.isUpperCase(a.charAt(i)))
			sb+=Character.toLowerCase(a.charAt(i));
		else
				sb+=a.charAt(i);
		}
		
		System.out.println(sb);
	}

}
