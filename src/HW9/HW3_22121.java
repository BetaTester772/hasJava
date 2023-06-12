package HW9;

import java.util.Scanner;

//HW3_안호성
public class HW3_22121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();

        while (x <= 0) {
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            System.out.print("정수를 입력하세요 ");
            x = sc.nextInt();
        }
        printTimes(x);
    }

    public static void printTimes(int n) {
        if (n <= 9)
            for (int i = 1; i <= 9; i++)
                System.out.println(n + " * " + i + " = " + n * i);

        else
            for (int i = 1; i <= n; i++)
                System.out.println(n + " * " + i + " = " + n * i);

    }
}
