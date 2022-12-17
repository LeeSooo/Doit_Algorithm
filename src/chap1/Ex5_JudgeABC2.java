package chap1;
// 입력한 정숫값을 판단(2)

import java.util.Scanner;

class Ex5_JudgeABC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int n = sc.nextInt();
        sc.close();

        if (n == 1)
            System.out.println("Ａ");
        else if (n == 2)
            System.out.println("Ｂ");
        else if (n == 3)
            System.out.println("Ｃ");
    }
}