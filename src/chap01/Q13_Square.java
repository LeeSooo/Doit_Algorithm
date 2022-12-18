package chap01;

// 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램 작성
// 경우의 수가 생기는 부분은 무조건 do-while문 처리. (생각을 하고 코드 작성. => 까먹지 말기)

import java.util.Scanner;
public class Q13_Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("정사각형을 출력합니다.");
		
		do {
			System.out.print("변의 길이 : ");
			n = sc.nextInt();
		} while (n <= 0);
		sc.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
