package lbh.java.ex;

import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			System.out.print("첫 번째 수 = ");
			int a = scanner.nextInt();
			System.out.print("연산자(+, -, *, /, %) = ");
			String ca = scanner.next();
			System.out.print("첫 번째 수 = ");
			int b = scanner.nextInt();
			
			switch (ca) {
			case "+":
				System.out.println(a+" + "+b+" = "+(a+b)+"\n");
				break;
			case "-":
				System.out.println(a+" - "+b+" = "+(a-b)+"\n");
				break;
			case "*":
				System.out.println(a+" * "+b+" = "+(a*b)+"\n");
				break;
			case "/":
				System.out.println(a+" / "+b+" = "+(a/b)+"\n");
				break;
			case "%":
				System.out.println(a+" % "+b+" = "+(a%b)+"\n");
				break;
			default:
				break;
			}
		}

	}
}
