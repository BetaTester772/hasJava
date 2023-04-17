package HW7;

// HW3_안호성
public class HW3_22121 {
    public static void main(String[] args) {
        int n = 20;
        int i = 2;

        while (i <= n) {
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }
            if (i == j) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
