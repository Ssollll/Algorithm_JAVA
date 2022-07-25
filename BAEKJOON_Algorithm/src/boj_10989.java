import java.util.*;
import java.io.*;

public class boj_10989 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] numarr = new int[N];
		for(int i = 0; i < N; i++) {
			numarr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(numarr);
		
		for(int j = 0; j < N; j++) {
			bw.write(String.valueOf(numarr[j]) + "\n");
		}
		
		br.close(); bw.flush(); bw.close();
	}
}
