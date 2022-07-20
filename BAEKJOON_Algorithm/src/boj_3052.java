import java.io.*;
import java.util.*;

public class boj_3052 {

//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int[] arr = new int[10];
//		int count = 0;
//		
//		for(int i = 0; i < 10; i++) {
//			arr[i] = Integer.parseInt(br.readLine()) % 42;
//		}
//		
//		for(int j = 0; j < 10; j++) {
//			boolean b = false;
//			for(int k = j + 1; k < 10; k++) {
//				if(arr[j] == arr[k]) {
//					b = true;
//					break;
//				}
//			}
//			if(b == false) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		// HashSet은 중복을 허용하지 않기에 사용
		
		for(int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(hs.size());
	}

}
