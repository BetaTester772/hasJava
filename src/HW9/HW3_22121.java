package HW9;

import java.util.Scanner;

public class HW3_22121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 7;

        while (true) {
            System.out.print("1-50 숫자를 입력하세요 : ");
            int x = sc.nextInt();

            if (checkNum(num, x)) {
                System.out.println("맞았습니다.");
                return;
            }

            System.out.println("틀렸습니다.");
        }
    }

    public static boolean checkNum(int num, int x) {
        if (num == x)
            return true;
        else
            return false;
    }
}
