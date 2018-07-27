package player;
import java.util.*;
public class LandFLCM {
  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter the two numbers");
	  int i=s.nextInt(),i1=s.nextInt();
	  int mul=1;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		for (int j = 1; j <=i1; j++) {
			if(i1%j==0) 
				arr.add(j);
			}
		for (int j2 = 1; j2 <=i; j2++) {
			if(i%j2==0)
				arr1.add(j2);
			}
		System.out.println(arr);
		System.out.println(arr1);
		int count=0;
		if(arr.size()>arr1.size()) {
			for (int j = 0; j < arr.size(); j++) {
				for (int j2 = 0; j2 < arr1.size(); j2++) {
					if(arr.get(j)==arr1.get(j2)) {
						count++;
					}
				}
			}
			if(count==arr1.size())
				System.out.println(arr.get(arr.size()-1));
			}
		else if(arr.size()<arr1.size()) {
			for(int a=0;a<arr1.size();a++) {
				for (int j = 0; j < arr.size(); j++) {
					if(arr.get(j)==arr1.get(a)) {
						count++;
					}
				}
			}
		if(count==arr.size()) {
			System.out.println(arr1.get(arr1.size()-1));
		}
	}
		 if(count==1) {
			
			System.out.println(i*i1);
		}
		else if(arr.size()==arr1.size()) {
			TreeSet <Integer> t=new TreeSet<Integer>();
			t.addAll(arr);
			t.addAll(arr1);
			arr.clear();
			arr.addAll(t);
			System.out.println(arr);
			for(int u=0;u<=t.size()-3;u++) {
				mul*=arr.get(u);
			}
			System.out.println(mul);
		}
		
	}

}
