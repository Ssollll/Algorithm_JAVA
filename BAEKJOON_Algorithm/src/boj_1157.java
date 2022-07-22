import java.io.*;

public class boj_1157 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		
		char[][] charr = new char[2][str.length()];
		for(int i = 0; i < str.length(); i++) {
			charr[0][i] = str.charAt(i);
			charr[1][i] = 1;
			
			for(int j = 0; j < i; j++) {
				if(charr[0][i] == charr[0][j]) {
					charr[1][j]++;
					break;
				}
			}
		}
		char ch = charr[0][0];
		int ans = charr[1][0];
		for(int k = 1; k < str.length(); k++) {
			if(ans < charr[1][k]) {
				ch = charr[0][k];
				ans = charr[1][k];
			} else if(ans == charr[1][k]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
