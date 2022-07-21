import java.util.*;

public class boj_1546 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] score = new int[N];
		for(int i = 0; i < N; i++) {
			score[i] = scan.nextInt();
		}
		Arrays.sort(score);
		
		int M = score[N-1];
		
		double result = 0;
		for(int j = 0; j < N; j++) {
			result += score[j];
		}
		
		System.out.println(result/M*100/N);
	}

}
