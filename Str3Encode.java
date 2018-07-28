package player;
import java.util.*;
public class Str3Encode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		char alpha[]=new char[27];
		int j=1;
		for(char i='a';i<='z';i++) {
			alpha[j++]=i;
		}
		char ss[]=s.toCharArray();
		for(int k=0;k<s.length();k++) {
			char r=ss[k];
			for(int b=0;b<alpha.length;b++) {
				if(r==alpha[b]&&r!='x'&&r!='y'&&r!='z') {
					res=res+alpha[b+3];
				}}
			if(r=='x') {
				res+='a';
			}
			if(r=='y') {
				res+='b';
			}
			if(r=='z') {
				res+='c';
			}
			}
		
		System.out.println(res);
  }

}
