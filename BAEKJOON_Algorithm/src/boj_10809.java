import java.util.*;

public class boj_10809 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		int[] result = new int[26];
		for(int i = 0; i < 26; i++) {
			result[i] = -1;
		}
		
		for(int j = 0; j < s.length(); j++) {
			char ch = s.charAt(j);
			
			if(result[ch - 'a'] == -1) {
				result[ch - 'a'] = j;
			}
		}
		for(int k = 0; k < 26; k++) {
			System.out.print(result[k] + " ");
		}
	}

}
