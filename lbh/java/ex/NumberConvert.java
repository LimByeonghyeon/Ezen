package lbh.java.ex;

import java.util.Scanner;

public class NumberConvert {

	public static void main(String[] args) {
		int binaryToDecimal = Integer.parseInt("1010", 2);
		int octalToDecimal = Integer.parseInt("12", 8);
		int hexaToDecimal = Integer.parseInt("A", 16);
		
		System.out.println("2진수 -> 10진수 : " + binaryToDecimal);
		System.out.println("8진수 -> 10진수 : " + octalToDecimal);
		System.out.println("16진수 -> 10진수 : " + hexaToDecimal);
		System.out.println();
		
		int decimal = 10;
		String binary = Integer.toBinaryString(decimal);
		String octal = Integer.toOctalString(decimal);
		String hexaDecimal = Integer.toHexString(decimal);
		
		System.out.println("10진수 : "+decimal);
		System.out.println("2진수 : "+binary);
		System.out.println("8진수 : "+octal);
		System.out.println("16진수 : "+hexaDecimal);
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("10진수 입력 : ");
		int de = scanner.nextInt();
		
		String bi = Integer.toBinaryString(de);
		String oc = Integer.toOctalString(de);
		String he = Integer.toHexString(de);
		
		System.out.println("2진수 : "+bi);
		System.out.println("8진수 : "+oc);
		System.out.println("16진수 : "+he);
	}

}
