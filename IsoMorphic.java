package player;

import java.util.*;

public class IsoMorphic {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		ArrayList<Character> ch =new ArrayList<Character>();
		ArrayList<Character> ch1 =new ArrayList<Character>();
		HashSet h=new HashSet();
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i)!=' ')
				ch.add(n.charAt(i));
		}
		h.addAll(ch);
		ch1.addAll(h);
		h.clear();
		for(int i=0;i<ch1.size();i++) {
			h.add(Collections.frequency(ch, ch1.get(i)));
		}
		if(h.size()==1)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
