package chap01;

// 가우스 덧셈을 이용하여 1부터 n까지 정수 합을 구하는 프로그램 작성

import java.util.Scanner;

public class Q07_SumGauss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1에서 n까지의 총합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		sc.close();

		// 가우스의 덧셈 : 일정한 간격의 정수가 순서대로 나열되있을 때 맨 앞의 정수와 맨 뒤의 정수를 더해나가는 방식
		// 무조건 n + 1이라는 값이 나옴.
		// ex. 1부터 10까지의 합 11*5 = 55
		
		int sum = (n + 1) * (n / 2);
		
		// 만약 정수의 개수가 홀수라면 남은 1개의 홀수를 더함.
		if(n % 2 == 1){
            sum += (n + 1) / 2;
        }

		System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");
	}
}
