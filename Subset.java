package hunter;

public class Subset {

	public static void main(String[] args) {
		int n=5;
		int m=3;
		int arr[]= {1,2,3,4,5};
		int brr[]= {1,2,3},count=0;
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==brr[i]) {
					count++;
					System.out.println(arr[i]+"..arr[i]");
					System.out.println(count);
				}
			}
		}System.out.println(count);
			if(count==brr.length) {
				System.out.println("yes");
			}
			else
				System.out.println("no");
		
	}

}
