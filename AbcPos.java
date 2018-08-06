package pro;
import java.util.*;
public class AbcPos {

	public static void main(String[] args) {
		char arr[]=new char[27];
		int o=1;
		for (char i = 'a'; i <='z'; i++) {
			arr[o++]=i;
		}
		Scanner s=new Scanner(System.in);
		String a=s.next(),b=s.next();
		String min="",max="";
		if(a.length()>=b.length()) {
			min=b;max=a;
		}
		else if(b.length()>a.length()) {
			min=a;max=b;
		}
		int z=0,x=0,y=0;
		for (int i = 0; i < min.length(); i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[j]==a.charAt(i)) {
					 x=j;
				}
				if(arr[j]==b.charAt(i)) {
					y=j;
				}
				
			}
			z+=Math.abs(x-y);
			
		}
		System.out.println(z);
		
	}

}
