package etc;

import java.util.Scanner;

class AAA {
	private int num;// 10 : 꺼졌다. 20 : 켜졌다

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AAA a = new AAA();
//		a.setNum(100);
		while (true) {
			// AAA a = new AAA();
			System.out.println("1. 저장");
			System.out.println("2. 확인");
			int i = input.nextInt();
			if (i == 1) {
				a.setNum(20);
			} else {
				System.out.println(a.getNum());
			}
		}
	}
}