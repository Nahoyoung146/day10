package Quiz2;

public class MemberDTO {
	private String name, grade;
	private int kor, eng, math, sum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(int sum) {
		if (this.getSum() / 3 >= 90)
			this.grade = "A";
		else if (this.getSum() / 3 >= 80)
			this.grade = "B";
		else
			this.grade = "C";
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public MemberDTO(String name, int kor, int eng, int math) {
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
		this.setSum(this.getKor() + this.getEng() + this.getMath());
		this.setGrade(this.getSum());
	}

	public String toString() {
		return "이름 : " + this.getName() + ", 국어점수 : " + this.getKor() + " , 영어점수 : " + this.getEng() + " , 수학점수 : "
				+ this.getMath() + " , 총합 : " + this.getSum() + " , 등급 : " + this.getGrade();
	}

}