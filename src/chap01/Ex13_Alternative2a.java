package chap01;
// +와 -를 번갈아 출력(2)(개선)

import java.util.Scanner;

class Ex13_Alternative2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);
        sc.close();
        
        for (int i = 1; i <= n / 2; i++)
            System.out.print("+-");

        if (n % 2 != 0)
            System.out.print("+");
    }
}