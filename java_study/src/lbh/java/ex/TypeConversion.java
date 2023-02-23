package lbh.java.ex;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TypeConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char c = str.charAt(0);
		System.out.println(c);
		
		char c1 = str.chars().mapToObj(ch -> (char) ch).toArray(Character[]::new)[0];
		System.out.println(c1);
	}
}
