package HW10;

// HW1_안호성
public class HW1 {
    public static void main(String[] args) {
        Plane1 p1 = new Plane1();
        Plane1 p2 = new Plane1(123456, "보잉737", 30);

        System.out.println("디폴트 비행기의 정보입니다.");
        System.out.println(p1.toString());
        System.out.println("제주행 비행기의 정보입니다.");
        System.out.println(p2.toString());
    }
}

class Plane1 {
    int id;
    String model;
    int capacity;

    public Plane1() {
        id = 0;
        model = "모름";
        capacity = 0;
    }

    public Plane1(int i, String m, int c) {
        id = i;
        model = m;
        capacity = c;
    }

    public String toString() {
        String rslt = "";
        rslt += "식별번호: " + id + "편\n";
        rslt += "모델: " + model + "\n";
        rslt += "승객수: " + capacity + "명\n";

        return rslt;
    }
}
