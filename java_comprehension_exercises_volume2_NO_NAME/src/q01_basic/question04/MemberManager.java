package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//以下
	public static void showAllMembers(Member[] member) {

		for (Member members : member) {

			members.showMember();

		}

	}

}
