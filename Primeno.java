package player;

import java.util.*;

public class Primeno {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int k=0;
		ArrayList arr=new ArrayList();
		int count=0,counter=0;
		for(int i=a;i<=b;i++) {
			count=0;
			for(int j=1;j<=b;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				arr.add(i);
				counter++;
				k++;
			}
		}
		
		
		System.out.println(arr);
	}

}
