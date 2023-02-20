package lbh.java.ex;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		
		do {
			System.out.println("가위바위보를 시작합니다.");
			System.out.println("1.가위 2.바위 3.보");
			System.out.print("숫자를 입력하세요 : ");
			int user = scanner.nextInt();
			int com = 0;
			Random r = new Random();
			
			com = r.nextInt(3)+1;
			System.out.print("유저"+user+"\t");
            System.out.println("컴퓨터"+com);
			if(user == 1) {
                if(com == 2) {
                       System.out.println("승리");
                }
                else if(com == 3) {
                       System.out.println("패배");
                }
                else {
                       System.out.println("무승부");
                }
         }
         else if(user == 2) {
                if(com == 2) {
                       System.out.println("무승부");
                }
                else if(com == 3) {
                       System.out.println("승리");
                }
                else {
                       System.out.println("패배");
                }
         }
         else if(user == 3) {
                if(com == 2) {
                       System.out.println("패배");
                }
                else if(com == 3) {
                       System.out.println("무승부");
                }
                else {
                       System.out.println("승리");
                }
         }
         else {
                System.out.println("다시 입력 해주세요!!");
         }i++;
		} while (i<4);
	}
}
