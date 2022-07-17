import java.util.*;

public class boj_10871 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int[] intarr = new int[N];
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = scan.nextInt();
			if(intarr[i] < X) {
				System.out.print(intarr[i] + " ");
			}
		}
		
	}

}
