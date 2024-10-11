package dto;

public class ServiceImpl01 {
	private DTO01 dto;
	public ServiceImpl01() {
		System.out.println("기본 생성자 실행");
		dto = new DTO01();
	}
	public void display() {
		System.out.println("serviceImple01 실행");
		//DTO01 dto = new DTO01();
		dto.setKor(100);
		dto.setEng(100);
		dto.setName("홍길동");
		dto.setSum(dto.getEng() + dto.getKor());

		System.out.println(dto.getName());
		System.out.println(dto.getKor());
		System.out.println(dto.getEng());
		System.out.println(dto.getSum());
	}
}