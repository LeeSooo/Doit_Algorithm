package chap1;
// Q1. 네 값의 최대갓ㅂ을 구하는 max4 메서드를 작성하세요.

import java.util.Scanner;

public class Q1_max4 {
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(max < b)
			max = b;
		if(max < c)
			max = c;
		if(max < d)
			max = d;
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("네 정수의 최대값을 구합니다.");
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		System.out.print("c의 값: ");
		int c = sc.nextInt();
		System.out.print("d의 값: ");
		int d = sc.nextInt();
		sc.close();
		
		System.out.println("최대값 : " +  max4(a, b, c, d));
	}

}
