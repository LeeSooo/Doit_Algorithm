package chap01;
// // *를 n개 출력하되 w개마다 줄 바꿈(2)

import java.util.Scanner;

class PrintStars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;

        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w값: ");
            w = sc.nextInt();
        } while (w <= 0 || w > n);
        sc.close();
        
        //.repeat(w)은 문자열을 w번 반복한 결과를 리턴.
        for (int i = 0; i < n / w; i++)
            System.out.println("*".repeat(w));

        int rest = n % w;
        if (rest != 0) 
            System.out.println("*".repeat(rest));
    }
}