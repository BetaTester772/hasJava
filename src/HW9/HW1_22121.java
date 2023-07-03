package HW9;

import java.util.Scanner;

//HW!_안호성
public class HW1_22121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 하세요: ");
        int x = sc.nextInt();
        System.out.println("입력한 정수는 " + x + "의 절댓값은 " + abs(x));
    }

    public static int abs(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }
}
