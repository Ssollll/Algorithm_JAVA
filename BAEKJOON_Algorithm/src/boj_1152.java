import java.io.*;

public class boj_1152 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		String[] sarr = s.split(" "); // 입력받은 문자열 공백기준 자르기

		System.out.println(sarr.length);
	}
}
