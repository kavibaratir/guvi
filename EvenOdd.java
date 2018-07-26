package player;

//import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		//String a=s.next();
		String a="abcd";
		String s="",temp,p="";
		for (int i = 0; i < a.length(); i+=2) {
			
			s=a.substring(i,i+1);
			p=a.substring(i+1,i+2);
			temp=s;
			s=p;
			p=temp;
			System.out.print(s+p);		
		}
		
		
	
		
		
	}

}
