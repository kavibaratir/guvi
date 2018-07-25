import java.util.Scanner;

public class DivideArr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=0;
		if(n%2==1) {
			a=(n-n/2)+1;
			b=n-a;
		}else {
			a=n/2;
			b=n/2;
		}
		int arr[]=new int[a];
		int brr[]=new int[b];
		for (int i = 0; i < a; i++) {
			arr[i]=s.nextInt();}
		
		for (int i = 0; i < b; i++) {
			brr[i]=s.nextInt();}
		
		int sum=0,avg=0,sum1=0,avg1=0;
		for (int i = 0; i <a; i++) {
			sum=sum+arr[i];}
		avg=(sum)/a;
		for(int i=0;i<b;i++) {
			sum1+=brr[i];}
		avg1=sum1/b;
		System.out.println(avg);
		System.out.println(avg1);
		if(avg==avg1) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}
