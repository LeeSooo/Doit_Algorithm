package chap01;

// Q15. n단의 피라미드를 출력하는 메서드 작성.
import java.util.Scanner;

public class Q15_StarPira {
	// 피라미드 출력 메서드
	//--- 특수문자 * 을 나열하여 피라미드를 출력 ---//
	static void spira(int n) {
		
		for (int i = 1; i <= n; i++) {					// i 행( i = 1, 2, ... , n )
			for (int j = 1; j <= n - i; j++)			// n - i 개의 ' ' 을 출력
				System.out.print(' ');
			
			for (int j = 1; j <= (i - 1) * 2 + 1; j++)		// (i - 1) * 2 + 1 개의 '*' 을 출력
				System.out.print('*');
			
			System.out.println();					
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("피라미드를 출력합니다.");

		do {
			System.out.print("단수는  : ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		spira(n);					// 피라미드를 출력
	}
}
