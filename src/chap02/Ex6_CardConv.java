package chap02;

import java.util.Scanner;

public class Ex6_CardConv {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.print(r + " |     " + x);
		// 기수 변환.
		do {
			System.out.println("  + -----------");
			System.out.print(r + " |     " + x);
			d[digits++] = dchar.charAt(x % r);
			System.out.println(" ... " + x % r);
			x /= r;
		} while (x != 0);
		
		// 배열 역순 저장.
		for (int i = 0; i < digits / 2; i++) {
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