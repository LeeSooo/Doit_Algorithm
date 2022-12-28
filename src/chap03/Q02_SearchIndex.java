package chap03;

import java.util.Scanner;

public class Q02_SearchIndex {

	//--- 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 선형검색(보초법)---//
	static int seqSearchEx(int[] arr, int n, int key) {
		
		// 첫 번째 줄
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		
		System.out.println();

		// 두 번째 줄
		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		
		System.out.println();
		
		// 세 번째 줄 (실질적 시작하는 코드)
		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			
			// ex) i가 2라면,
			// [ (i * 4) + 3 = 11 ] => (%%11s \n, "") 
			// 즉, 11번 "" 출력
			
			// (1) %s : 문자열 출력 
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			// (2) 인덱스 출력 정수의 자리스가 3자리보다 작으면 왼쪽정렬이 되서 맞춤.
			System.out.printf("%3d|", i);
			
			// 배열 출력
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", arr[k]);
			
			// 네 번째 줄
			System.out.println("\n   |");
			
			// 검색 시도.
			if (arr[i] == key)
				return i;					// 검색 성공
		}
		return -1;						// 검색 실패
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];		// 배열의 길이가 num 인 배열 

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			arr[i] = sc.nextInt();
		}

		System.out.print("검색 값 : ");				// 키값을 입력받음
		int key = sc.nextInt();
		sc.close();
		
		int result = seqSearchEx(arr, num, key);	// 배열 x에서 값이 ky인 요소를 검색

		if (result == -1)
			System.out.println("그 값의 요소는 존재하지 않습니다.");
		else
			System.out.println("그 값은 x[" + result + "]에 있습니다.");
	}
}
