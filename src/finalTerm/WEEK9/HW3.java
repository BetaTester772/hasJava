package finalTerm.WEEK9;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		int x = getInput();
		printTimes(x);
	}
	
	public static int getInput() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		while(x <= 0) {
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			x = sc.nextInt();
		}
		return x;
		
//		int x;
//		do {
//			System.out.print("정수를 입력하세요: ");
//			x = sc.nextInt();
//		
//			if (x <= 0) {
//				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
//			}
//		} while (x <= 0);
//		
//		return x;
		
	}

	public static void printTimes(int n) {
		
		int end = 10;
		if (n >= end) {
			end = n + 1;
		}
		
		for (int i = 1; i < end; i++)
			System.out.println(n + " * " + i + " = " + n * i);
	}

}
