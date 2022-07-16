import java.util.*;

public class boj_2475 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int[] intarr = new int[5];
		for (int i = 0; i < 5; i++) {
			intarr[i] = scan.nextInt();
			sum += intarr[i] * intarr[i];
		}
		int result = sum % 10;
		System.out.println(result);
	}

}
