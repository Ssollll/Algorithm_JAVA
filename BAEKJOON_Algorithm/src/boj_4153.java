import java.util.*;

public class boj_4153 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int[] tri = new int[3];
			for(int i = 0; i < 3; i++) {
				tri[i] = scan.nextInt();
			}
			
			if(tri[0] == 0) { 
				break;
			}
			
			Arrays.sort(tri); //Ȥ�� ������������ �Ǿ����� ���� ��� ���
			
			if(tri[0]*tri[0] + tri[1]*tri[1] == tri[2]*tri[2]) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}

}
