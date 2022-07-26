import java.util.*;

public class boj_2609 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int gcd = gcd(A, B);
		
		System.out.println(gcd);
		System.out.println(A * B / gcd);
	}
	
	public static int gcd(int A, int B) {
		if(B == 0) {
			return A;
		} else  {
			return gcd(B, A%B);
		}
	}

}
