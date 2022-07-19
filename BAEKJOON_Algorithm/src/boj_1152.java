import java.io.*;
import java.util.*;

public class boj_1152 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens()); // 토큰의 갯수 세기
		

//		String[] sarr = s.split(" "); // 입력받은 문자열 공백기준 자르기
		// 단순 공백으로 자르면 문자열 앞 뒤의 공백도 같이 계산되기에 split 함수는 이 문제에 적합하지 않음
		// StringTokenizer을 사용해야 함

//		System.out.println(sarr.length);
	}
}
