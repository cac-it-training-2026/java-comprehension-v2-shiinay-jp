package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;

		//以下
		ConsoleReader consoleReader = new ConsoleReader();
		int num = 0;
		String pass = null;
		Member loginMember = null;

		Member member = new Member();

		do {

			try {

				num = consoleReader.inputNumber();

			} catch (IOException e) {

				e.printStackTrace();

			} catch (NumberFormatException e) {

				System.out.println("不正な入力です");
				e.printStackTrace();

			}

			try {

				pass = consoleReader.inputString();

			} catch (IOException e) {

				e.printStackTrace();

			}

			loginMember = loginService.doLogin(num, pass);

			if (loginMember != null) {
				isLogin = true;
				member = loginMember;
				System.out.println("ログインに成功しました");
			} else {
				System.out.println("「ID またはパスワードが違っています。再度入力してください。");
			}

		} while (!isLogin);

		System.out.println("ログインユーザ情報を表示します。");
		member.showMember();

	}

}
