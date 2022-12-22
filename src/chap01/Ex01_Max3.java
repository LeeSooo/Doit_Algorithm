package chap01;
// 1-1. 3개의 정숫값을 입력하고 최댓값을 구하여 출력

/* (1) 입력 : a, b, c
 * (2) max에 a를 대입.
 * (3) b와 max 비교. (만약 b가 max보다 크다면, max = b)
 * (4) c와 max 비교. (만약 c가 max보다 크다면, max = c)
 */

import java.util.Scanner;

class Ex01_Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : ");  
        int a = sc.nextInt();
        System.out.print("b의 값 : ");  
        int b = sc.nextInt();
        System.out.print("c의 값 : ");  
        int c = sc.nextInt();
        sc.close();
        
        // 비교
        int max = a;
        
        if (max < b) 
        	max = b;
        
        if (max < c) 
        	max = c;

        // 출력
        System.out.println("최댓값은 " + max + "입니다.");
    }
}