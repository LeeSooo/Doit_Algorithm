package chap1;
// 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.

/* (1) 매개변수로 3개의 변수를 입력받는다. (a, b, c)
 * (2) min = a
 * (3) min > b => min = b
 * (4) min > c => min = c
 */

import java.util.Scanner;

public class Q2_min3 {
	public static int min3(int a, int b, int c) {
		int min = a;
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 정수의 최솟값을 구합니다.");
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		System.out.print("c의 값: ");
		int c = sc.nextInt();
		sc.close();
		
		System.out.println("최솟값 : " +  min3(a, b, c));
	}
}
