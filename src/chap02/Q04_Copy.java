package chap02;

import java.util.Scanner;

public class Q04_Copy {
	// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy
	static void copy(int[] a, int b[]) {
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열 a의 길이는  : ");
		int num = sc.nextInt();		// 배열의 길이
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		int[] b = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		sc.close();
		
		copy(a, b);			// 배열 b의 모든 요소를 배열 a에 copy 

		System.out.println("배열 b의 모든 요소를 배열 a에 복사하였습니다.");
		for (int i = 0; i < num; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}