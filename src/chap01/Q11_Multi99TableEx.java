package chap01;

// 구구단 곱셈표를 출력하는 프로그램

public class Q11_Multi99TableEx {
	public static void main(String[] args) {
		System.out.print("   |");
		
		for (int i = 1;i <= 9; i++)
			System.out.printf("%3d", i);
		
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			
			System.out.println();
		}
	}
}
