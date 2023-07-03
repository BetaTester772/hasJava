package finalTerm.WEEK11;

public class HW1 {

	public static void main(String[] args) {
		
		System.out.println("디폴트 비행기의 정보입니다.");
		Plane p1 = new Plane();
		System.out.println(p1.toString());
		
		System.out.println("제주행 비행기의 정보입니다.");
		Plane p2 = new Plane();
		
		// 설정자와 접근자를 이용해서 완성
		p2.setId(123456);
		p2.setModel("보잉737");
		p2.setCapacity(50);
	
		System.out.println(p2.toString());
	}

}

class Plane {
	private int id;
	private String model;
	private int capacity;
	
	// this 참조를 이용하도록 변경할 것
	public Plane() {
		id = 0;
		model = "모름";
		capacity = 0;
	}
	
	// 설정자와 접근자 완성
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	// 설정자와 접근자를 이용해서 완성
	public String toString() {
		String rslt = "";
		rslt += "식별변호: " + getId() + "편\n";
		rslt += "모델: " + getModel() + "\n";
		rslt += "승객수: " + getCapacity() + "명\n";
		
		return rslt;
	}
}
