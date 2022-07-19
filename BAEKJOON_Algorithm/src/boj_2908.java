import java.io.*;
import java.util.*;

public class boj_2908 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
 		String B = st.nextToken();
		
		int[] num1 = new int[3];
		int[] num2 = new int[3];
		
		int k = 0;
		for(int i = 2; i >= 0; i--) {
			num1[i] = A.charAt(k) - '0';
			num2[i] = B.charAt(k) - '0';
			k++;
		}
		
		int first = num1[0] * 100 + num1[1] * 10 + num1[2];
		int second = num2[0] * 100 + num2[1] * 10 + num2[2];
		
		System.out.println(Math.max(first, second));
	}

}
