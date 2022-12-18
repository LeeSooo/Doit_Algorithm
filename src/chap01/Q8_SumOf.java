package chap01;

// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드 작성
import java.util.Scanner;

public class Q8_SumOf {
	static int sumof(int a, int b) {
		int sum = 0;
		int min;
		int max;
		
		if (a > b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a에서 b까지의 총합을 구합니다.");
		
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a + "에서 " + b + "까지의 총합은 " + sumof(a, b) + "입니다.");
	}
}
