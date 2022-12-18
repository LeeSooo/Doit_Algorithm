package chap01;
// +와 -를 번갈아 출력(2)

/* (1) for문을 n / 2회 출력.
 * (2) 홀수일 경우 + 출력, 
 */

import java.util.Scanner;

class Ex13_Alternative2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n / 2; i++)
            System.out.print("+-");

        // 홀수일 경우. + 출력
        if (n % 2 != 0)
            System.out.print("+");
    }
}
