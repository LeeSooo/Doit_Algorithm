package chap03;
// 선형 검색(보초법)
// 보초법 : 반복의 종료를 알리는 특정한 값인 보초(Sentinel) 값을 사용하여,
// 	종료 조건중 검색 실패 조건을 제거하여 판단 횟수를 줄이는 방법입니다.

/* 
 * 선형검색(보초법)
 * 	SequentialSearch.java에서는 다음과 같은 종료조건을 판단해야합니다.
 *  1. 검색할 값을 발견하지 못하고 배열의 끝을 지나간 경우
 *  2. 검색할 값과 같은 요소를 발견한 경우
 *  하지만 이 판단을 절반으로 줄일 수 있는 방법인 보초법은 다음과 같습니다.
 *  초기데이터인 배열을 그대로 두고, 배열 1칸을 늘려 늘린 칸에 검색할 값을 넣습니다. (즉, index가 제일 큰 값이 곧 검색할 값이 됩니다.)
 *  이렇게 하면 원래 배열 범위에서 만족하는 값을 찾지 못하더라도 무조건 위 2번과 같은 종료조건을 만족하게 됩니다. (마지막에 검색할 값을 넣어버렸으므로 )
 *  이렇게 하면 1번의 조건은 필요가 없게 됩니다.
*/

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