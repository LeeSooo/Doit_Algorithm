package chap03;
// 선형 검색(보초법)
// 보초법 : 반복의 종료를 알리는 특정한 값인 보초(Sentinel) 값을 사용하여,
// 			종료 조건중 검색 실패 조건을 제거하여 판단 횟수를 줄이는 방법입니다.

import java.util.Scanner;

class Ex03_SeqSearchSen {
    //--- 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색 ---//
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;             // 보초를 추가

        while (true) {
            if (a[i] == key)    // 검색 성공
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];                        // 요솟수가 num + 1인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색 값 : ");                    // 키값을 읽력받음
        int ky = sc.nextInt();
        sc.close();
        
        int idx = seqSearchSen(x, num, ky);              // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("검색 값의 요소가 없습니다.");
        else
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
    }
}