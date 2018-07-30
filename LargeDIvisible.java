package player;

import java.util.*;

public class LargeDIvisible {

	public static void main(String[] args) {
		int []arr= {1,1};
		ArrayList a=new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <=arr[i]; j++) {
				if(arr[i]%j==0) {
					a.add(j);
				}
			}
			
		}
		System.out.println(a);int y=0,c=0;
		in:for(int i=a.size()-1;i>=0;i--) {
			c=0;
			for(int j=i;j>=0;j--) {
				if(a.get(i)==a.get(j)) {
					c++;
					
				}
				if(c==2) {
					y=(int)a.get(i);
					break in;
				}
			}
		}
      System.out.println(y);
		
		
		
	}

}
