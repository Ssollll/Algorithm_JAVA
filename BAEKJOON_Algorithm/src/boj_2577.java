import java.io.*;

public class boj_2577 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String result = String.valueOf(A*B*C);
		
		int[] count = new int[10];
		for(int i = 0; i < 10; i++) {
			count[i] = 0;
		}

		for(int j = 0; j < result.length(); j++) {
			int a = result.charAt(j) - '0';
			count[a]++;
		}
		
		for(int k = 0; k < 10; k++) {
			System.out.println(count[k]);
		}
	}

}
