package chap01;

// Q10. 양의 정수를 입력하고 자리 수를 출력하는 프로그램

import java.util.Scanner;

public class Q10_DigitsNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;	// 입력 값
		int cnt = 0;	// 자리 수
		
		do {
			System.out.println("양의 정수를 입력해주세요.");
			input = sc.nextInt();
		} while(input <= 0);
		sc.close();
		
		while(input != 0) {
			input = input / 10;
			cnt++;
		}
		System.out.println("그 수는 " + cnt + "자리입니다.");
	}
}
