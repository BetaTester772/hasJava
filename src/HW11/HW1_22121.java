package HW11;

// HW1_안호성
public class HW1_22121 {
    public static void main(String[] args) {

        System.out.println("디폴트 비행기의 정보입니다.");
        Plane p1 = new Plane();
        System.out.println(p1.toString());

        System.out.println("제주행 비행기의 정보입니다.");
        Plane p2 = new Plane();

        p2.setId(123456);
        p2.setModel("보잉737");
        p2.setCapacity(30);

        System.out.println(p2.toString());

    }
}

class Plane {
    private int id;
    private String model;
    private int capacity;

    public Plane() {
        this.id = 0;
        this.model = "모름";
        this.capacity = 0;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        String rslt = "";
        rslt += "식별번호: " + getId() + "편\n";
        rslt += "모델: " + getModel() + "\n";
        rslt += "승객수: " + getCapacity() + "명\n";

        return rslt;
    }
}