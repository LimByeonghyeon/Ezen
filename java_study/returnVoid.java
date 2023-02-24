package java_study;

public class returnVoid {
	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return;
	}
	public static void main(String[] args) {
		sum(5,2);
//		외부에서 출력 불가능
//		System.out.println("더하기 연산 결과값 : "+sum(5,2));
		
	}
}
