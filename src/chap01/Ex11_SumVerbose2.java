package chap01;
// 1, 2, …, n의 합과 그 값을 구하는 과정을 출력(2)

// Ex10이랑 비교할 때, for문의 반복 횟수가 n-1번으로 줄였다.

import java.util.Scanner;

class Ex11_SumVerbose2 {
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

        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;        // sum에 i를 더함
        }
        
        System.out.print(n + " = ");
        sum += n;            // sum에 n을 더함
        System.out.println(sum);
    }
}