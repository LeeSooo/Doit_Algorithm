package chap03;


import java.util.Scanner;

public class Q4_BinSearchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len, key, left, mid, right;
		int min = 0; 
		
		// (1) 배열의 크기를 입력받는다.
		System.out.println("배열의 크기를 입력해주세요.");
		len = sc.nextInt();
		int[] arr = new int[len];
		
		// (2) 배열 요소를 입력받는다. - do While문 : 정렬을 입력 받아야한다.
		System.out.println("배열의 요소를 입력해주세요.");
		for (int i = 0; i < len; i++) {
			do {
				System.out.print("[" + i + "] : ");
				arr[i] = sc.nextInt();
			} while(min < arr[i]);
			min = arr[i];
		}
		
		// (3) 키를 입력받는다.
		System.out.println("키를 입력해주세요.");
		key = sc.nextInt();
		
		// (4) 첫 번째 줄을 출력한다.
		System.out.println("___|");
		for(int i = 0; i < len; i++) {
			System.out.printf("%%%d", i);
		}
		System.out.print("\n");
		
		// (5) 두 번째 줄을 출력한다.
		System.out.println("---+");
		for(int i = 0; i < len * 4 + 2; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
		
		// (6) 세 번째 줄을 출력한다.
		System.out.print("   |");
		
		// (7) 네 번째 줄을 출력한다.
		
		// (8) 결과를 출력한다.
	}
}
