package HW6;

//HW2_안호성
public class HW2_22121 {
    public static void main(String[] args) {
        double x = -100;

        System.out.println("x값은? " + x);

        double y = 0.0;

        if (x <= 0) {
            y = x * x * x - 9 * x + 2;
        } else if (x > 0) {
            y = 7 * x + 2;
        }

        System.out.println("f(x) = "+ y);
    }
}
