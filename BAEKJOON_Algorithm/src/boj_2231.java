import java.io.*;

public class boj_2231 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		int len_N = num.length();
		int N = Integer.parseInt(num);
		
		int result = 0;
		
		for(int i = (N-(len_N*9)); i < N; i++) {
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number%10;
				number /= 10;
			}
			
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		br.close();
	}

}
