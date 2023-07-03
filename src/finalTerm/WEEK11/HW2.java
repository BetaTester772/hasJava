package finalTerm.WEEK11;

public class HW2 {

	public static void main(String[] args) {
		Date d = new Date();
		
		// 설정자와 접근자를 이용해 생일 설정
		d.setYear(2000);
		d.setMonth(2);
		d.setDay(13);
		
		System.out.println("생일은 " + d.toString() + "입니다.");
		
		// 설정자와 접근자 모두 사용하여 성년 설정
		d.setYear(d.getYear()+20);
		
		System.out.println("성년일은 " + d.toString() + "입니다.");
	}

}


class Date {
	private int year;
	private int month;
	private int day;

	public Date() {
		year = 1900;
		month = 1;
		day = 1;
	}
	
	// 설정저와 접근자 완성 
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	// 설정자와 접근자를 이용해 완성
	public String toString() {
		String rslt = "";
		rslt += getYear() + "년 ";
		rslt += getMonth() + "월 ";
		rslt += getDay() + "일";
		return rslt;
	}






}