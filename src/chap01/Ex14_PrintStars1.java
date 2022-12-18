package chap01;
// *를 n개 출력하되 w개마다 줄 바꿈(1)
/* 이 프로그램은 변수 i값을 1씩 증가시키면서 *를 출력합니다.
 * for 문에서 변수 i값을 w값으로 나눈 나머지가 w - 1일 때(for문 i가 0부터 시작하기 때문임.), 줄바꿈을 합니다.
 * 마지막 줄 줄바꿈은 n값이 w값의 배수가 아닐 때(줄바꿈이 되지 않은 경우)만 줄 바꿈을 합니다. 
 */

import java.util.Scanner;

class Ex14_PrintStars1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;

        System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

        // 입력
        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w값: ");
            w = sc.nextInt();
        } while (w <= 0 || w > n);
        sc.close();
        
        // 출력
        for (int i = 0; i < n; i++) {
            System.out.print("*");		 // * 출력.
            if (i % w == w - 1)				
                System.out.println();    // i가 w개수가 되면 자동 줄바꿈.
        }
        
        if (n % w != 0)         		 // i % w != 0 이라면, 마지막 줄은 줄바꿈이 되지 않기 때문에 이 문장 실행.
            System.out.println();
    }
}