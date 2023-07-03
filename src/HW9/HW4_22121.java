package HW9;

import java.util.Scanner;

//HW4_안호성
public class HW4_22121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 7;

        while (true) {
            System.out.print("1-50 숫자를 입력하세요 : ");
            int x = sc.nextInt();

            if (checkNum(num, x)) {
                System.out.println("맞았습니다.");
                break;
            }

            System.out.println("틀렸습니다.");
        }
    }

    public static boolean checkNum(int num, int x) {
        return num == x;
    }
}
