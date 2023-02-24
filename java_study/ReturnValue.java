package java_study;

// return을 사용하면 출력한다.
// ex) get(), set(), void()
// void(),set()는 값을 입력받아서 저장하기 때문에 return을 생략한다.
public class ReturnValue {
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		sum(5,2);
		System.out.println("더하기 연산 결과값 : "+sum(5,2));
	}
}
