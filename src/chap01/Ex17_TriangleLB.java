package chap01;
//왼쪽 아래가 직각인 이등변삼각형을 출력

import java.util.Scanner;

public class Ex17_TriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력니다.");

        do {
            System.out.print("몇 단 삼각형입니까?: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}