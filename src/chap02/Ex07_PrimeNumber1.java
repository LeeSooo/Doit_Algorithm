package chap02;
// 1,000 이하의 소수를 나열(버전 1）
// 출력 : for문을 통해 찾은 소수 출력, 나눗셈을 수행한 횟수

class Ex07_PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;        // 나눗셈 횟수

        // 1,000 이하의 소수를 나열하는 프로그램
        // 첫 번째 for문 : 2 ~ 1,000까지 1씩 증가
        for (int n = 2; n <= 1000; n++) {
        	
            // 두 번째 for문 : 소수 판별
        	int i;
            for (i = 2; i < n; i++) {
                counter++;			// 나눗셈 횟수 증가
                if (n % i == 0)     // 나누어떨어지면 소수가 아님
                    break;          // 반복은 더 이상 불필요
            }
            if (n == i)                // 마지막까지 나누어떨어지지 않음
                System.out.println(n);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}