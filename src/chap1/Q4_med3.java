package chap1;
// Q4. 세 값의 대소 관계인 13가지 조합의 중앙값을 구하여 출력하는 프로그램 작성

public class Q4_med3 {
	public static int med3(int a, int b, int c) {
		if(a >= b) {
			// 확정 : a >= b
			if(b >= c)
				// a >= b >= c
				return b;
			else if(a >= c)
				// 확정 : c > b
				// a >= c > b
				return c;
			else
				// (c > a)
				// 확정 : c > b
				// c > a >= b
				return a;
			
		} else { 
			// 확정 : b > a
			if(a > c)
				// b > a > c
				return a;
			
			else if(b > c)
				// b > c > a
				return c;
			else
				// c > b > a
				return b;
		}
	}
	
	/*//--- 답 : a, b, c의 중앙값을 구하여 반환 ---//
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
		else
			return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}*/
		
	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a＞b＞c
		System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a＞b＝c
		System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a＞c＞b
		System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a＝c＞b
		System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c＞a＞b
		System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a＝b＞c
		System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a＝b＝c
		System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c＞a＝b
		System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b＞a＞c
		System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b＞a＝c
		System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b＞c＞a
		System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b＝c＞a
		System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c＞b＞a
	}
}
