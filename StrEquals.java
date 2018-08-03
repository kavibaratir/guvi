package pro;
import java.util.*;
public class StrEquals {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arrlen");
		int strlen=sc.nextInt();
		System.out.println("enter the strings");
		String sa[]= new String[strlen];
		sa[0]=sc.next();
		int min=sa[0].length(),count=0;
		for (int i = 0; i < strlen-1; i++) {
			sa[i]=sc.next();
			if(min==sa[i].length()) {
				count++;
			}
			if(count==sa.length) {
				min=sa[0].length();
			}
			else
			min=Math.min(min, sa[i].length());
		}
		String g="";
		for (int i = 0; i < strlen-1; i++) {
			for (int j = 0; j <=min-1; j++) {
				try {
				if(sa[i].charAt(j)==sa[i+1].charAt(j)) {
					g+=sa[i].charAt(j);
				}
				else
					break;
				}
				catch(Exception e) {
					
				}
			}
		}
		
		System.out.println(g);
		sc.close();
	}

}
