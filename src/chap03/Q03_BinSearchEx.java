package chap03;

import java.util.Scanner;

public class Q03_BinSearchEx {
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		// (1) 배열 안에 키를 찾기
		int j = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == key){
				idx[j] = i;
				j++;
			}
		}
		return j;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len, key;
		
		// (1) 배열의 길이을 입력받기
		System.out.println("배열의 길이를 입력해주세요.");
		len = sc.nextInt();
		int[] arr = new int[len];
		
		// (2) 배열의 요소 입력받기
		System.out.println("배열의 요소를 입력해주세요.");
		for(int i = 0; i < len; i++) {
			System.out.print("arr [" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		
		
		// (3) 배열의 요소 출력하기
		System.out.print("arr : ");
		for(int i = 0; i < len; i++) {
			System.out.print(i);
			if(i != (len - 1)) {
				System.out.print(", ");
			}
		}
		
		// (4) 키 입력받기
		System.out.println("\n찾으시는 키를 입력해주세요.");
		key = sc.nextInt();
		sc.close();
		
		int[] idx = new int[len];
		int count = searchIdx(arr, len, key, idx);		// 배열 x안의 값이 ky인 요소를 y에 copy 

		if (count == 0)
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		else
			for (int i = 0; i < count; i++)
				System.out.println("그 값은 " + "x[" + idx[i] + "]에 있습니다.");
	}
}
