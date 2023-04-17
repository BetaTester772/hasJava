package HW7;

// HW4_안호성
public class HW4_22121 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 6) {
            int j = 1;
            while (j < 7) {
                if (j == i)
                    System.out.print(i * 2);
                else
                    System.out.print("-");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}