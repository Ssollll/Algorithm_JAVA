import java.util.*;

public class boj_1085 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = y;
		arr[2] = w - x;
		arr[3] = h - y;
		
		Arrays.sort(arr);
		
		System.out.println(arr[0]);
	}

}
