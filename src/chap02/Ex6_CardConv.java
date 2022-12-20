package chap02;
// 입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 출력하는 예제

// <"정수값을 특정 기수로 변환하는 알고리즘">
// 만약 10진수를 2진수로 기수변환을 할 경우, 나누는 값을 2로 계속 나누면서 
// 0이 나올 때 까지 나눈 나머지를 모두 문자열처럼 합하여 표현하는 것입니다.
import java.util.Scanner;

class Ex6_CardConv {
    //--- 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환 ---//
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;                        // 변환 뒤 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";	// 진수 변환을 위해 저장되는 문자열 (2진수 ~ 36진수까지)

        do {
            d[digits++] = dchar.charAt(x % r);    // r로 나눈 나머지를 저장.
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {    // 배열 d의 숫자 문자열을 역순 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;                       // 변환 할 정수
        int cd;                       // 기수
        int dno;                      // 변환 뒤 자릿수
        int retry;                    // 다시 한 번?
        char[] cno = new char[32];    // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
        	// 기수 변환할 10진수 입력받기
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = sc.nextInt();
            } while (no < 0);

            // 변환 진수 선택
            do {
                System.out.print("어떤 진수로 변환할까요?(2-36): ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);            // no를 cd 진수로 변환

            System.out.print(cd + "진수로 ");
            for (int i = 0; i < dno; i++)            // 순서대로 표시
                System.out.print(cno[i]);
            System.out.println("입니다.");

            System.out.print("다시 한 번 할까요? (1…예/0…아니오): ");
            retry = sc.nextInt();
        } while (retry == 1);
        sc.close();
    }
}