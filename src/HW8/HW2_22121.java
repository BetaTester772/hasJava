package HW8;

// HW2_안호성
public class HW2_22121 {
    public static void main(String[] args) {
        for (int x = 0; x * 4 < 60; x++) {
            for (int y = 0; y * 5 < 60; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
    }
}
