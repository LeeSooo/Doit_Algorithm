package chap1;
// 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.

/* (1) 매개변수로 4개의 정수 값을 입력받는다. (a, b, c, d)
 * (2) min = a
 * (3) min > b => min = b
 * (4) min > c => min = c
 * (5) min > d => min = d
 */

import java.util.Scanner;

public class Q3_min4 {
	public static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		if(min > d)
			min = d;
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("네 정수의 최솟값을 구합니다.");
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		System.out.print("c의 값: ");
		int c = sc.nextInt();
		System.out.print("d의 값: ");
		int d = sc.nextInt();
		sc.close();
		
		System.out.println("최대값 : " +  min4(a, b, c, d));
	}
}
