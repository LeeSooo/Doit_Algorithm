package chap01;
// +와 -를 번갈아 출력(1)(개선)
//+와 -를 번갈아 출력(1)
//중요 : 반복문 안에 조건문을 작성하면 프로그램의 효율이 떨어짐.
//만일 Ex11 처럼 i를 1부터 시작하여도 조건문은 동일하게 존재해야 한다.

import java.util.Scanner;

class Ex12_Alternative1a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();

        for (int i = 1; i <= n; i++)
            if (i % 2 == 0)                    // 홀수
                System.out.print("-");
            else                               // 짝수
                System.out.print("+");
    }
}