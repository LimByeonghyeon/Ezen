package min.java.view;

import java.util.Scanner;

import min.java.service.Counter;

public class CounterView {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Counter counter = new Counter();
		System.out.println("두수를 더하세요");
		System.out.print("첫번째 수 : ");
		int num5 = scanner.nextInt();
		System.out.print("두번째 수 : ");
		int num6 = scanner.nextInt();
		System.out.println("더한 결과");
		counter.sum3(num5,num6);
		
//		리턴값이 있는 것
//		Scanner scanner = new Scanner(System.in);
//		Counter counter = new Counter();
//		System.out.println("두수를 더하세요");
//		System.out.print("첫번째 수 : ");
//		int num1 = scanner.nextInt();
//		System.out.print("두번째 수 : ");
//		int num2 = scanner.nextInt();
//		System.out.println("더한 결과");
//		
//		int re = Counter.sum1(num1, num2);
//		System.out.println(re);
	}
}
