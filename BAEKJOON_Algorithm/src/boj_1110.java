import java.util.*;

public class boj_1110 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int temp = N;
		int count = 0;
		
		while(true) {
			int x = temp / 10; //�־��� ���� ���� ��
			int y = temp % 10; //�־��� ���� ������ ��
			int z = (x + y) % 10; // ���� ���� ������ ��
			
			temp = y * 10 + z;
			
			count++;
			
			if(N == temp) {
				break;
			}
			
		}
		System.out.println(count);
	}

}
