package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {

	//フィールド
	String name;
	int age;
	int rank;

	public void showMember() {

		System.out.println("---SHOW DATA---");//mainメソッド内で記述する（任意）
		System.out.println("***MEMBER DATA***");//classメソッド内に記述（必須）
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");//classメソッド内に記述（必須）

	}

}
