import java.util.*;

public class boj_9498 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if (score / 10 == 10 || score / 10 == 9) {
			System.out.println("A");
		} else if (score / 10 == 8) {
			System.out.println("B");
		} else if (score / 10 == 7) {
			System.out.println("C");
		} else if (score / 10 == 6) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
