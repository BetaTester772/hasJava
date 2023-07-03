package HW10;

// HW2_안호성
public class HW2_22121 {
    public static void main(String[] args) {
        Plane2 p1 = new Plane2();
        Plane2 p2 = new Plane2(123456, "보잉737", 30);
        Plane2 p3 = new Plane2(7891011, "보잉737", 230);

        System.out.println("디폴트 비행기의 정보입니다.");
        System.out.println(p1.toString());

        System.out.println("제주행 비행기의 정보입니다.");
        Plane2.planes++;
        System.out.println("현재까지 추가된 항공편은 "+Plane2.planes+"대 입니다.");
        System.out.println(p2.toString());

        System.out.println("누욕행 비행기의 정보입니다.");
        Plane2.planes++;
        System.out.println("현재까지 추가된 항공편은 "+Plane2.planes+"대 입니다.");
        System.out.println(p3.toString());

    }
}

class Plane2 {
    public static int planes = 0;

    int id;
    String model;
    int capacity;

    public Plane2() {
        id = 0;
        model = "모름";
        capacity = 0;
    }

    public Plane2(int i, String m, int c) {
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
