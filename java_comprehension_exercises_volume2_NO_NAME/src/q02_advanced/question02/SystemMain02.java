package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//以下
		ConsoleReader consoleReader = new ConsoleReader();

		int num;
		String new_pass;
		List<Member> members = new ArrayList<>();

		members.add(Member.getInstance(1, "PasswOrd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1));

		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");

		try {

			num = consoleReader.inputNumber();

		} catch (IOException e) {

			e.printStackTrace();
			return;

		} catch (NumberFormatException e) {

			System.out.println("不正な入力です");
			e.printStackTrace();
			return;

		}

		try {

			new_pass = consoleReader.inputString();

		} catch (IOException e) {

			e.printStackTrace();
			return;

		}

		MemberManager.updatePassword(members, num, new_pass);
		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);

	}

}
