package lbh.java.ex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class LottoGame extends JFrame{
	JLabel num, num2, ch, u1,u2,u3,u4,u5,u6,u7;	//num: 추첨힛수, ch: 추첨번호 , u1~u7: 추첨번호 7개 라벨
	JLabel re,d1,d2,d3,d4,d5,d6,d7;	//re: 도전결과, d1~d7: 도전번호 7개 라벨  
	JLabel chnum,zerojb,onejb,twojb,threejb,fourjb,fivejb,sixjb,sevenjb;		//도전 상황 등수 출력라벨
	JButton choice, result, exit; //추첨번호버튼, 도전번호버튼, 종료버튼
	ArrayList<Integer> hs, hs2;	//추첨번호(hs)와 도전번호(hs2) 저장 배열리스트
	int zero=0, one=0, two=0, three=0, four=0, five=0, six=0, seven=0, count=0, chcount=0; //등수 카운트 저장
	//count는  상단에 추첨번호 횟수 , chcount는 도전횟수
	class choiceButton implements ActionListener{	//추첨버튼 클릭시 발생되는 이벤트
		public void actionPerformed(ActionEvent e) {
			hs =  new ArrayList<Integer>(); 	//추첨번호 저장 배열리스트
		      while(hs.size() <7){ 
		         hs.add((int)(Math.random()*(45-1+1)+1));	//추첨번호 랜덤 출력
		         for(int i=0; i<hs.size()-1; i++){		//중복 제거하는 for문
		        	 if(hs.get(hs.size()-1) == hs.get(i)){	
		        		 hs.remove(hs.size()-1);	//중복발생시 중복된 번호 제거한 후 다시 랜덤출력
		        		 break;
		        	 }
		         }
		      }	//랜덤으로 뽑은 추첨번호 라벨에 출력
		      u1.setText(Integer.toString(hs.get(0)));
		      u2.setText(Integer.toString(hs.get(1)));
		      u3.setText(Integer.toString(hs.get(2)));
		      u4.setText(Integer.toString(hs.get(3)));
		      u5.setText(Integer.toString(hs.get(4)));
		      u6.setText(Integer.toString(hs.get(5)));
		      u7.setText(Integer.toString(hs.get(6)));
		      zerojb.setText("- 꽝 : 0회"); sevenjb.setText("- 7등 : 0회");	//추첨번호버튼을 클릭하면 등수와 도전 결과가 초기화
		      sixjb.setText("- 6등 : 0회"); fivejb.setText("- 5등 : 0회");	//되므로 처음으로 되돌린다
		      fourjb.setText("- 4등 : 0회"); threejb.setText("- 3등 : 0회");
		      twojb.setText("- 2등 : 0회"); onejb.setText("- 1등 : 0회");
		      chnum.setText("- 총 도전 횟수: 0회");
		      re.setText("도전 결과 : "); num.setText(Integer.toString(++count));	//추첨횟수 변경
		      zero=0; one=0; two=0; three=0; four=0; five=0; six=0; seven=0; chcount=0;	//등수 초기화하면서 등수 카운트 변수도 0으로 초기화
		}
	}
	
	class resultButton implements ActionListener{	//도전번호 생성한 후 추첨번호와 비교하여 맞힌개수에 따라 등수 출력하는 이벤트
		public void actionPerformed(ActionEvent e) {
			 	int right = 0; chcount++;//맞힌 개수
			 	hs2 =  new ArrayList<Integer>(); //추첨번호와 동일하게 랜덤으로 출력받은 후 중복을 제거한다
		        while(hs2.size() <7){ 
		          hs2.add((int)(Math.random()*(45-1+1)+1)); 
		          for(int i=0; i<hs2.size()-1; i++){
			        	 if(hs2.get(hs2.size()-1) == hs2.get(i)){
			        		 hs2.remove(hs2.size()-1);
			        		 break;
			        	 }
			         }
		        } //도전번호를 라벨에 출력
		          d1.setText(Integer.toString(hs2.get(0)));
			      d2.setText(Integer.toString(hs2.get(1)));
			      d3.setText(Integer.toString(hs2.get(2)));
			      d4.setText(Integer.toString(hs2.get(3)));
			      d5.setText(Integer.toString(hs2.get(4)));
			      d6.setText(Integer.toString(hs2.get(5)));
			      d7.setText(Integer.toString(hs2.get(6)));
			      
		        for(int i: hs){ //추첨번호와 도전번호를 비교하여 맞힌개수 확인 
		          for(int i2: hs2){ 
		             if(i==i2){ 
		                 right++; 
		                 break; 
		               } 
		           } 
		          } 
		         switch(right){	//맞힌 개수에 따라 등수를 카운터하여 출력
		         case 0:
		        	 zero++;
		        	 zerojb.setText("- 꽝 : "+zero+"회");break;
		         case 1:
		        	 seven++;
		        	 sevenjb.setText("- 7등 : "+seven+"회");break;
		         case 2:
		        	 six++;
		        	 sixjb.setText("- 6등 : "+six+"회");break;
		         case 3:
		        	 five++;
		        	 fivejb.setText("- 5등 : "+five+"회");break;
		         case 4:
		        	 four++;
		        	 fourjb.setText("- 4등 : "+four+"회");break;
		         case 5:
		        	 three++;
		        	 threejb.setText("- 3등 : "+three+"회");break;
		         case 6:
		        	two++;
		        	twojb.setText("- 2등 : "+two+"회");break;
		         case 7:
		        	 one++;
		        	 onejb.setText("- 1등 : "+one+"회");break;
		         }
		         if(right == 0)	//도전 결과에 몇 등인지를 출력하는 부분
		        	 re.setText("도전 결과 : 꽝!!");	//0개일때 꽝
		         else
		        	 re.setText("도전 결과 : "+(8-right)+"등!!!");;  //갯수에 따른 등수 출력
		         chnum.setText("- 총 도전 횟수: "+chcount+"회");
		}
	}
	LottoGame(){
		Container c = this.getContentPane();	//컨텐츠펜을 설정
		c.setLayout(null);	// 레이아웃을 설정을 제거하여 일일히 x,y좌표와 크기를 설정하여 출력
		c.setBackground(Color.white);
		setTitle("Lotto 추첨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600,500);
	
		choiceButton cb = new choiceButton();	//추첨번호을 클릭했을때 발생하는 이벤트 클래스
		resultButton rb = new resultButton();	//도전번호를 클릭했을때 발생하는 이벤트 클래스
		
		num2 = new JLabel("제");
		num2.setBounds(25,30,15,15);
		num = new JLabel("0");
		num.setForeground(Color.RED);	//색상 설정
		num.setBounds(40,30,15,15);	//setBounds(x좌표, y좌표, 가로크기, 세로크기);
		
		JLabel lottoText = new JLabel(" 회  로또 추첨");
		lottoText.setBounds(55, 30, 120, 15);

		ch = new JLabel("추첨번호");		//추첨번호 라벨과 7개 번호 라벨
		ch.setForeground(Color.RED);
		ch.setBounds(20,100, 60, 15);
		
		u1= new JLabel("0");
		u1.setBounds(100, 100, 15, 10);
		
		u2= new JLabel("0");
		u2.setBounds(150,100, 15, 10);
		
		u3= new JLabel("0");
		u3.setBounds(200,100, 15, 10);
		
		u4= new JLabel("0");
		u4.setBounds(250,100, 15, 10);
		
		u5= new JLabel("0");
		u5.setBounds(300,100, 15, 10);
		
		u6= new JLabel("0");
		u6.setBounds(350,100, 15, 10);
		
		u7= new JLabel("0");
		u7.setBounds(400,100, 15, 10);
		
		choice = new JButton("추첨 실행");
		choice.setBounds(430,90,100,30);
		choice.setForeground(Color.white); //버튼의 글자 색상
		choice.setBackground(Color.BLUE);	//버튼의 배경 색상
		
		result = new JButton("도전 실행");
		result.setBounds(20,150,100,30);
		result.setForeground(Color.white);
		result.setBackground(Color.BLUE);
		
		d1= new JLabel("0");		//도전번호라벨과 7개 번호
		d1.setBounds(150, 160, 15, 10);
		
		d2= new JLabel("0");
		d2.setBounds(180, 160, 15, 10);
		
		d3= new JLabel("0");
		d3.setBounds(210, 160, 15, 10);
		
		d4= new JLabel("0");
		d4.setBounds(240, 160, 15, 10);
		
		d5= new JLabel("0");
		d5.setBounds(270, 160, 15, 10);
		
		d6= new JLabel("0");
		d6.setBounds(300, 160, 15, 10);
		
		d7= new JLabel("0");
		d7.setBounds(330, 160, 15, 10);
		
		re = new JLabel("도전 결과 : ");
		re.setBounds(360,150,150,30);
		
		JLabel score = new JLabel("** 현재의 도전 상황 **");
		score.setBounds(150,190,150,30);
		
		chnum = new JLabel("- 총 도전 횟수: 0회");
		chnum.setBounds(150,215,180,30);
		
		onejb = new JLabel("- 1등 : 0회");
		onejb.setBounds(150, 240, 150, 30);
		
		twojb = new JLabel("- 2등 : 0회");
		twojb.setBounds(150, 265,150, 30);
		
		threejb = new JLabel("- 3등 : 0회");
		threejb.setBounds(150, 290, 150, 30);
		
		fourjb = new JLabel("- 4등 : 0회");
		fourjb.setBounds(150, 315, 150, 30);
		
		fivejb = new JLabel("- 5등 : 0회");
		fivejb.setBounds(150, 340, 150, 30);
		
		sixjb = new JLabel("- 6등 : 0회");
		sixjb.setBounds(150, 365, 150, 30);
		
		sevenjb = new JLabel("- 7등 : 0회");
		sevenjb.setBounds(150, 390, 150, 30);
		
		zerojb = new JLabel("- 꽝 : 0회");
		zerojb.setBounds(150, 415, 150, 30);
		
		exit = new JButton("종료 버튼");
		exit.setBounds(450,400,100,30);
		exit.setForeground(Color.white);
		exit.setBackground(Color.GREEN);

		//컨텐츠팬에 컴포넌트를 붙이기
		c.add(num);c.add(num2);c.add(lottoText); //제 0회 로또 추첨번호
		c.add(ch);c.add(u1);c.add(u2);c.add(u3);c.add(u4);c.add(u5);c.add(u6);c.add(u7); //추첨번호, 라벨 7개
		choice.addActionListener(cb); c.add(choice);	//추첨번호버튼
		result.addActionListener(rb); c.add(result);	//도전번호버튼
		c.add(d1);c.add(d2);c.add(d3);c.add(d4);c.add(d5);c.add(d6);c.add(d7); //도전번호 라벨7개
		c.add(re);
		//등수 라벨 추가
		c.add(score);c.add(chnum);c.add(onejb);c.add(twojb);c.add(threejb);c.add(fourjb);c.add(fivejb);c.add(sixjb);c.add(sevenjb);c.add(zerojb);
		exit.addActionListener(new ActionListener() {	//종료버튼
			public void actionPerformed(ActionEvent e) {
				System.exit(0);}});
		c.add(exit);
	}
	public static void main(String[] args) {
		LottoGame js = new LottoGame();
	}
}
