package Quiz1;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginService03 {
	private LoginDTO03 dto;

	public LoginService03() {
		dto = new LoginDTO03();
	}

	public void display() {
		ArrayList<String> arrid = new ArrayList<String>();
		ArrayList<String> arrpwd = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 로그인\n2. 회원가입\n3. 탈퇴\n4. 전체 회원 보기\n5. 종료");
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				if (arrid.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");
				else {
					System.out.print("아이디 입력 : ");
					dto.setId(sc.next());
					if (!arrid.contains(dto.getId()))
						System.out.println("존재하지 않은 id입니다.");

					else {
						System.out.print("비밀번호 입력 : ");
						dto.setPwd(sc.next());
						if (!arrpwd.contains(dto.getPwd()))
							System.out.println("비밀번호가 틀렸습니다.");

						else
							System.out.println("인증통과");
					}
				}
				break;
			case 2:
				System.out.print("아이디 입력 : ");
				dto.setId(sc.next());
				if (arrid.contains(dto.getId()))
					System.out.println("사용자가 존재합니다. 탈퇴 후 진행하세요!!!");

				else {
					System.out.print("비밀번호 입력 : ");
					dto.setPwd(sc.next());
					arrid.add(dto.getId());
					arrpwd.add(dto.getPwd());
					System.out.println("축하합니다. 회원가입이 완료되었습니다.");
				}
				break;
			case 3:
				if (arrid.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					System.out.print("삭제할 아이디 입력 : ");
					dto.setId(sc.next());
					if (arrid.contains(dto.getId())) {
						int num = arrid.indexOf(dto.getId());
						arrid.remove(num);
						arrpwd.remove(num);
						System.out.println("회원탈퇴가 완료되었습니다.");
					}

					else
						System.out.println("해당 아이디는 존재하지 않습니다.");
				}
				break;
			case 4:
				if (arrid.size() == 0)
					System.out.println("회원가입 먼저 진행해주세요.");

				else {
					for (int i = 0; i < arrid.size(); i++) {
						System.out.println("아이디 : " + arrid.get(i) + ", 비밀번호 : " + arrpwd.get(i));
					}
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
}