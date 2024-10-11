package Quiz2;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
	private MemberDTO dto;

	public MemberService() {
		dto = new MemberDTO("111", 90, 80, 70);
	}

	public void function() {
		ArrayList<MemberDTO> student = new ArrayList<MemberDTO>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 학생등록\n2. 학생보기\n3. 정보수정\n4. 정보삭제\n5. 프로그램 종료");
			System.out.print("번호 입력 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("이름 입력 : ");
				dto.setName(sc.next());
				System.out.print("국어점수 입력 : ");
				dto.setKor(sc.nextInt());
				System.out.print("영어점수 입력 : ");
				dto.setEng(sc.nextInt());
				System.out.print("수학점수 입력 : ");
				dto.setMath(sc.nextInt());
				student.add(new MemberDTO(dto.getName(), dto.getKor(), dto.getEng(), dto.getMath()));
				System.out.println("학생 등록 완료");
				break;
			case 2:
				if (student.size() == 0) {
					System.out.println("등록된 학생이 없습니다.");
				}

				for (int i = 0; i < student.size(); i++) {
					System.out.println(student.get(i));
				}
				break;
			case 3:
				System.out.print("수정할 학생 이름 입력 : ");
				String name = sc.next();
				for (int i = 0; i < student.size(); i++) {
					if (student.get(i).getName().equals(name)) {
						System.out.println("1. 이름 수정\n2. 국어점수 수정\n3. 영어점수 수정\n4. 수학 점수 수정");
						System.out.print("번호 입력 : ");
						int num0 = sc.nextInt();
						if (num0 == 1) {
							System.out.print("수정할 이름 입력 : ");
							String changename = sc.next();
							student.get(i).setName(changename);
						}
						if (num0 == 2) {
							System.out.print("수정할 국어점수 입력 : ");
							int changekor = sc.nextInt();
							student.get(i).setKor(changekor);
						}
						if (num0 == 3) {
							System.out.print("수정할 영어점수 입력 : ");
							int changeeng = sc.nextInt();
							student.get(i).setEng(changeeng);
						}
						if (num0 == 4) {
							System.out.print("수정할 수학점수 입력 : ");
							int changemath = sc.nextInt();
							student.get(i).setMath(changemath);
						}
						student.get(i)
								.setSum(student.get(i).getKor() + student.get(i).getEng() + student.get(i).getMath());
						student.get(i).setGrade(student.get(i).getSum());
						System.out.println("수정완료");
						break;
					}

					if (i == student.size() - 1) {
						System.out.println("존재하지 않는 학생입니다.");
					}
				}

				break;
			case 4:
				System.out.print("삭제할 학생 이름 입력 : ");
				String name0 = sc.next();
				for (int i = 0; i < student.size(); i++) {
					if (student.get(i).getName().equals(name0)) {
						student.remove(i);
						System.out.println("삭제완료");
					}

					if (i == student.size() - 1) {
						System.out.println("존재하지 않는 학생입니다.");
					}
				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}