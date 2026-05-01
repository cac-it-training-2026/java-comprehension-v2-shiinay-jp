package q02_advanced.question03;

import java.util.List;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;//MemberStorage型のアドレスを入れる箱を作っただけ

	//以下
	//コンストラクタ
	/**
	 * 
	 */
	public LoginService() {
	}

	/**
	 * @param memberStorage
	 */
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	//アクセスメソッド
	/**
	 * @return memberStorage
	 */
	public MemberStorage getMemberStorage() {
		return memberStorage;
	}

	/**
	 * @param memberStorage セットする memberStorage
	 */
	public void setMemberStorage(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	//メソッド
	public Member doLogin(int targetID, String targetPassword) {

		boolean flag = false;
		Member returnMember = null;
		List<Member> members = memberStorage.getMembers();

		for (Member member : members) {

			if (member.getId() == targetID && member.getPassword().equals(targetPassword)) {

				returnMember = member;
				flag = true;
				break;

			}

		}

		if (!flag) {
			System.out.println("該当者はいませんでした。");

		}

		return returnMember;

	}

}
