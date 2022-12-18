package chap01;

// Q14. 직각 이등변삼각형 출력
import java.util.Scanner;

public class Q14_Triangle {
	// 왼쪽 아래가 직각인 이등변 삼각형
	static void triangleLB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위가 직각인 직각삼각형
	private static void triangleRU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각인 직각삼각형
	private static void triangleRB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("삼각형을 출력합니다.");

		do {
			System.out.print("단수는：");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();

		System.out.println("왼쪽 아래 직각삼각형");
		triangleLB(n);			// 왼쪽 아래가 직각인 직각삼각형

		System.out.println("왼쪽 위 직각삼각형");
		triangleLU(n);			// 왼쪽 위가 직각인 직각삼각형

		System.out.println("오른쪽 위 직각삼각형");
		triangleRU(n);			// 오른쪽 위가 직각인 직각삼각형

		System.out.println("오른쪽 아래 직각삼각형");
		triangleRB(n);			// 오른쪽 아래가 직각인 직각삼각형
	}
}
