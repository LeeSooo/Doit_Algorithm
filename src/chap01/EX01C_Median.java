package chap01;
// 3개의 정숫값을 입력하고 중앙값을 구하여 출력

import java.util.Scanner;

class EX01C_Median {
    static int med3(int a, int b, int c) {
    	
    	// 경우의 수 : 
    	// 조건 : a >= b
        if (a >= b)				
            if (b >= c)			// a >= b >= c
                return b;
            else if (c >= a)	// c >= a >= b
                return a;
            else				// a >= c >= b
                return c;
        
        // 조건 : b > a
        else if (a > c)			// b > a > c
            return a;
        else if (b > c)			// b > c > a
            return c;
        else					// c > b > a
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a 값 : ");  
        int a = sc.nextInt();
        System.out.print("b 값 : ");  
        int b = sc.nextInt();
        System.out.print("c 값 : ");  
        int c = sc.nextInt();
        sc.close();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}