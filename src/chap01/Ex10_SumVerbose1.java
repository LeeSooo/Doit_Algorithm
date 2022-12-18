package chap01;
// 1, 2, …, n의 합과 그 값을 구하는 과정을 출력(1)
// 중요 : 반복문 안에 조건문을 작성하면 프로그램의 효율이 떨어짐.

import java.util.Scanner;

class Ex10_SumVerbose1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();
        
        int sum = 0;        // 합

        for (int i = 1; i <= n; i++) {
            if (i < n)        // 중간 과정
                System.out.print(i + " + ");
            else              // 마지막 과정
                System.out.print(i + " = ");
            sum += i;         // sum에 i를 더함
        }

        System.out.println(sum);
    }
}