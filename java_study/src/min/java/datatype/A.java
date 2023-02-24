package min.java.datatype;

import java.io.IOException;

public class A {
	public static void main(String[] args) throws IOException {
		System.out.println("영어문자");
		char c = (char) System.in.read();

		if (c>='a'&c<='z') {
			System.out.println(c+"는 소문자 입니다.");
		} else if (c>='A'& c<='Z') {
			System.out.println(c+"는 대문자 입니다.");
		} else {
			System.out.println("이외입력");
		}
		
	}
}