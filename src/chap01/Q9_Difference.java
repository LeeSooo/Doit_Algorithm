package chap01;

// 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
// * 변수 b에 입력한 값이 a값 이하면 변수 b값을 다시 입력하세요.

import java.util.Scanner;

public class Q9_Difference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.print("a값:");
		a = sc.nextInt();
		System.out.print("b값:");
		b = sc.nextInt();
		
		while(a >= b) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b값:");
			b = sc.nextInt();
		}
		sc.close();
		System.out.print("b - a는 " + (b-a) + "입니다.");
		
	}
}
