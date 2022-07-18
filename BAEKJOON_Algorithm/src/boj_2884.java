import java.util.*;

public class boj_2884 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M < 45) { // 분이 45보다 작으면
			H -= 1; // 시에서 1빼고
			M += 15; // 분에서 15 더하고
			if(H < 0) { // 만약 시가 0보다 작을 경우
				H = 23; // 시를 23으로 바꿔놓기
			}
		} else { // 분이 45보다 클 경우
			M -= 45; // 분에서 45 뺴주기
		}
		System.out.println(H + " " + M);
	}

}
