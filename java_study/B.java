package java_study;

public class B {
	public static void main(String[] args) {
//		for(int i=2;i<10;i++) {
//			for(int j=1;j<10;j++) {
//				System.out.print(i+"x"+j+"="+(i*j)+"\0");
//			}
//			System.out.println();
//		}
		System.out.println("구구단 출력");
		System.out.println("-------------------------------");
		for(int i=1;i<10;i+=3) {
			for(int j=1;j<10;j++) {
				for(int k=i;k<3+i;k++) {
					System.out.print(k+"x"+j+"="+(j*k)+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
