package q01_basic.question05;

public class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(AbstMember[] member) {

		for (AbstMember members : member) {

			members.showMember();

		}

	}
}
