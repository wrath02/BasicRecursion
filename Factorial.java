package recursionbasic;
import java.util.Scanner;

public class Factorial {
	static int fact(int n) {
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int f=fact(n);
		System.out.println(f);
		
		
	}

}
