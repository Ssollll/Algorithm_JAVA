import java.util.*;

public class boj_2675 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			int R = scan.nextInt();
			String s = scan.next();
			char[] ch = new char[s.length()];
			for(int j = 0; j < s.length(); j++) {
				ch[j] = s.charAt(j);
			}
			int k = 0;
			while (k < ch.length) {
				for(int l = 0; l < R; l++) {
					System.out.print(ch[k]);
				}
				k++;
			}
			System.out.println();
		}
	}

}
