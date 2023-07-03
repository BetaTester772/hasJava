package HW8;

import java.util.Scanner;

// HW3_안호성
public class HW3_22121 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("정수를 입력하세요(0입력 시 반복 종료) : ");
            n = sc.nextInt();
            sum += n;
        } while (n != 0);
        System.out.println("누적 합: " + sum);
    }
}
