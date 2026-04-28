package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		//以下
		members[0] = new NonMember("Sato Kensuke");
		members[1] = new Member(1, "Passw0rd", "Miura manabu", 28, 2);

		System.out.println("---SHOW MEMBERS---");
		MemberManager.showAllMembers(members);

		System.out.println("\n---BUY ITEM---");
		for (AbstMember abstMember : members) {
			abstMember.buyItem();
		}

	}

}
