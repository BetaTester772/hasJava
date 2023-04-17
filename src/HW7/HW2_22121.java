package HW7;

// HW2_안호성
public class HW2_22121 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("정수 1부터 " + n + "까지의 짝수를 출력합니다.");

        int i = 1;
        while (i < n) {
            if (i % 2 == 1) {
                i++;
                System.out.println(i);
            }
            i++;
        }
    }
}
