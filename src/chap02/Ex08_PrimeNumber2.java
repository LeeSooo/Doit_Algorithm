package chap02;
// 1,000 이하의 소수를 나열(버전 2)
// 출력 : for문을 통해 찾은 소수 출력, 나눗셈을 수행한 횟수

// (1) 2를 제외한 나머지 짝수는 소수가 아님으로 제외한다. => 소수 검색 시 짝수를 제외하고 검색.

class Ex08_PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;                                // 나눗셈 횟수
        int ptr = 0;                                    // 찾은 소수의 개수
        int[] prime = new int[500];                     // 소수를 저장하는 배열
        System.out.println(prime[ptr]);
        
        prime[ptr++] = 2;                               // 2는 소수임
        for (int n = 3; n <= 1000; n += 2) {            // 조사 대상은 홀수만
            int i;
            for (i = 1; i < ptr; i++) {                 // 이미 찾은 소수로 나누어 봄
                counter++;								// 나눗셈 횟수 증가
                if (n % prime[i] == 0)                  // 나누어떨어지면 소수가 아님
                    break;                              // 더 이상의 반복은 불필요
            }
            if (ptr == i) {                             // 마지막까지 나누어떨어지지 않음
                prime[ptr++] = n;                       // 소수로 배열에 저장
                System.out.println(prime[i]);
            }
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}