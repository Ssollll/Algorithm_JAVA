import java.io.*;
import java.util.*;

public class boj_1152 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens()); // ��ū�� ���� ����
		

//		String[] sarr = s.split(" "); // �Է¹��� ���ڿ� ������� �ڸ���
		// �ܼ� �������� �ڸ��� ���ڿ� �� ���� ���鵵 ���� ���Ǳ⿡ split �Լ��� �� ������ �������� ����
		// StringTokenizer�� ����ؾ� ��

//		System.out.println(sarr.length);
	}
}
