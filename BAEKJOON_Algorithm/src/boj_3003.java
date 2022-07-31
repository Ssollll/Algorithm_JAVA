import java.io.*;
import java.util.StringTokenizer;

public class boj_3003 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] chess = new int[6];
		int[] result = {1, 1, 2, 2, 2, 8};
		
		for(int i = 0; i < 6; i++) {
			chess[i] = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(result[i] - chess[i]) + " ");
		}
		
		br.close();bw.flush();bw.close();
	}

}
