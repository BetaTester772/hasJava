package finalTerm.WEEK8;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		do {
			System.out.print("정수를 입력하세요(0입력시 반복 종료): ");
			n = sc.nextInt();
			sum += n;
			
		} while(n != 0);

		System.out.println("누적 합: " + sum);
	}

}
