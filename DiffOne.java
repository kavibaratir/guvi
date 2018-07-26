package player;
import java.util.*;
public class DiffOne {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String ss[]=a.split(" ");
		LinkedHashSet<Character> h=new LinkedHashSet<Character>();
		LinkedHashSet<Integer> h1=new LinkedHashSet<>();
		for(int i=0;i<ss.length;i++) {
			h.clear();
			for(int j=0;j<ss[i].length();j++) {
			h.add(ss[i].charAt(j));
			}
			System.out.println(h);
			h1.add(h.size());
			}
		if(h1.size()==1) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
		//System.out.println(h1);
		
	}

}
