package lbh.java.ex;

import java.util.Scanner;

public class Charcount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		
		System.out.println("a의 개수 "+countChar(a,'a'));
		System.out.println("b의 개수 "+countChar1(a,'b'));
		System.out.println("c의 개수 "+countChar2(a,'c'));
	}
	public static int countChar(String str, char ch) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch)
				count++;
		}
		return count;
	}
	//스트림 무슨구존지 확인해야됨 void come(se, int age)
	public static long countChar1(String str, char ch) {
		return str.chars().filter(c -> c == ch).count();
	}
	//replace() > 개수를 세려고 하는 문자를 찾아서 공백으로 변환, 세려고 한 문자 갯수만큼 문자열 줄어듬
	public static int countChar2(String str, char ch) {
		//찾는 문자의 개수 = 원본 문자열의 길이 - 찾는 문자를 공백으로 변경한 문자열의 길이
		return str.length() - str.replace(String.valueOf(ch),"").length();
	}
}
