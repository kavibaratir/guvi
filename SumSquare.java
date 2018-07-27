package player;

public class SumSquare {

	public static void main(String[] args) {
		int n=11;
		int s,e=0,o=0;
		while(n!=0) {
			s=n%10;
			e=e+(s*s);
			n=n/10;
		}
		System.out.println(e);
		for (int i = 0; i < 2; i/=10) {
			
		}
	}

}
