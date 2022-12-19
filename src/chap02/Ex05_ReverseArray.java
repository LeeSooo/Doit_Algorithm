package chap02;
// 배열 요소에 값을 읽어 들여 역순으로 정렬

import java.util.Arrays;
import java.util.Scanner;

class Ex05_ReverseArray {
    //--- 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
    }

    //--- 배열 a의 요소를 역순으로 정렬 ---//
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 길이: ");
        int num = sc.nextInt();         // 배열의 길이(요솟수)

        int[] arr = new int[num];            // 요솟수가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        reverse(arr);        // 배열 a의 요소를 역순으로 정렬

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println("x = " + Arrays.toString(arr));
    }
}
