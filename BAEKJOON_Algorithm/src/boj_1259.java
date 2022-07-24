import java.io.*;
import java.util.Arrays;

public class boj_1259 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String s = br.readLine();
			if(s.equals("0")) {
				break;
			}
			char[] ch = new char[s.length()];
			char[] chrev = new char[s.length()];
			for(int i = 0; i < s.length(); i++) {
				ch[i] = s.charAt(i);
				chrev[s.length() - 1 - i] = s.charAt(i);
			}
			if(Arrays.equals(ch, chrev)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
		}
	}

}
