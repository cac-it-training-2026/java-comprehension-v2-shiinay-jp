package q02_advanced.question03;

import java.util.List;

public class MemberManager {

	//コンストラクタ
	private MemberManager() {

	}

	//メソッド
	public static void showAllMembers(List<Member> members) {

		for (Member member : members) {

			member.showMember();

		}

	}

	public static void updatePassword(List<Member> members, int targetID, String newPassword) {

		boolean flag = false;

		for (Member member : members) {

			if (member.getId() == targetID) {

				member.setPassword(newPassword);
				flag = true;

				break;

			}

		}

		if (!flag) {
			System.out.println("該当者はいませんでした。");
		}

	}

}
