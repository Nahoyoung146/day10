package dto;

class Test01 {
	private String name;
	/*
	 * if(true) { name="홍길동"; }else { name="김개똥"; }
	 */

	public Test01() {
		System.out.println("기본 생성자 실행");
	}

	public Test01(String name) {
		System.out.println(name + " : 생성자 실행");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void test() {

	}

	public void test(String s) {

	}

	public void test(int s) {

	}
}

public class Ex01 {
	public static void main(String[] args) {
		String name = "홍길동";
		Test01 t = new Test01(name);
//		t.setName();
		System.out.println("main : " + t.getName());
	}
}