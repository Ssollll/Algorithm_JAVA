import java.util.*;

public class boj_2562 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] mat = new int[9][2];
		for(int i = 1; i < 10; i++) {
			mat[i-1][0] = i;
			mat[i-1][1] = scan.nextInt();
		}
		
		Arrays.sort(mat, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		System.out.println(mat[8][1]);
		System.out.println(mat[8][0]);
	}

}
