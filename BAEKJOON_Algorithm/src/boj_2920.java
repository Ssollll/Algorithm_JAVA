import java.util.*;

public class boj_2920 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] input = new int[8];
		for(int i = 0; i < 8; i++) {
			input[i] = scan.nextInt();
		}
		int[] asc = new int[8];
		int[] desc = new int[8];
		for(int j = 0; j < 8; j++) {
			asc[j] = j + 1;
			desc[j] = 8 - j;
		}
		
		if(Arrays.equals(input, asc)) {
			System.out.println("ascending");
		} else if(Arrays.equals(input, desc)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}

}
