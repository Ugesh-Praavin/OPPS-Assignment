package Second;
import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		if(n<=3) return true;
		if(n%2==0 || n%3==0) return false;
		for (int i=5;i*i<=n;i+=6) {
			if(n%i==0 || n%(i+2)==0) return false;
		}return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=in.nextInt();
		if(isPrime(num)) {
			System.out.println(num+" is a prime");
		}else {
			System.out.println(num+" is not a prime");
		}
		in.close();
	}

}
