package HW2;

//HW2_안호성
public class HW2_22121 {
    public static void main(String[] args) {
        int money = 10000;
        int total = 7500;

        System.out.println("받은 돈 : " + money);
        System.out.println("상품의 총액 : " + total);

        double vat = total * 0.1;
        double change = money - total - vat;

        System.out.println("부가가치세 : " + vat);
        System.out.println("잔돈 : " + change);
    }
}
