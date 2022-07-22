import java.io.*;

public class boj_8958 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] pro = new String[T];
		
		for (int i = 0; i < T; i++) {
			pro[i] = br.readLine();
			int score = 0;
			int id = 0;
			for (int j = 0; j < pro[i].length(); j++) {
				if(pro[i].charAt(j) == 'O') {
					score++;
					score += id;
					id++;
				} else if(pro[i].charAt(j) == 'X') {
					id = 0;
				}
			}
			System.out.println(score);
		}

	}

}
