package chap01;
// *를 n개 출력하되 w개마다 줄 바꿈(2)

/*  - "*".repeat(w) : w번 문자열을 반복.
 * (1) for문을 통해 n / w 번 반복 실행합니다.
 * (2) 남아있는 마지막 줄 * => n % w
 */
import java.util.Scanner;

class Ex15_PrintStars2 {
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
        
        //.repeat(w) : 문자열을 w번 반복한 결과를 리턴.
        // n/w : 줄의 개수.
        for (int i = 0; i < n / w; i++)
            System.out.println("*".repeat(w));

        // 마지막 줄 출력.
        int rest = n % w;
        if (rest != 0) 
            System.out.println("*".repeat(rest));
    }
}