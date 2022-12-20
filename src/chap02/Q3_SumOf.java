package chap02;

import java.util.Scanner;

public class Q3_SumOf {
	
	// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();     

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("\n 배열의 모든 합계 : " + sumOf(arr));
	}
}
