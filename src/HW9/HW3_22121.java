package HW9;

import java.util.Scanner;

//HW3_안호성
public class HW3_22121 {
    public static void main(String[] args) {
        int x = getInput();

        printTimes(x);
    }

    public static void printTimes(int n) {
        int num = n;

        if (n <= 9) num = 9;

        for (int i = 1; i <= num; i++)
            System.out.println(n + " * " + i + " = " + n * i);

    }

    public static int getInput() {
        int x;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("정수를 입력하세요: ");
            x = sc.nextInt();
            if (x <= 0)
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        } while (x <= 0);
        return x;
    }
}
