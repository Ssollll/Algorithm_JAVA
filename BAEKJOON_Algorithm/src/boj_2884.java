import java.util.*;

public class boj_2884 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M < 45) { // ���� 45���� ������
			H -= 1; // �ÿ��� 1����
			M += 15; // �п��� 15 ���ϰ�
			if(H < 0) { // ���� �ð� 0���� ���� ���
				H = 23; // �ø� 23���� �ٲ����
			}
		} else { // ���� 45���� Ŭ ���
			M -= 45; // �п��� 45 ���ֱ�
		}
		System.out.println(H + " " + M);
	}

}
