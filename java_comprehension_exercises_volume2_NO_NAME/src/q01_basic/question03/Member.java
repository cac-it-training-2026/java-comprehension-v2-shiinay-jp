package q01_basic.question03;

class Member {

	//フィールド
	private String name;
	private int age;
	private int rank;

	/**
	 *
	 */
	public Member() {

	}

	/**
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	//メソッド	
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	public void showMember() {

		System.out.println("---SHOW DATA---");//mainメソッド内で記述する（任意）
		System.out.println("***MEMBER DATA***");//classメソッド内に記述（必須）
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");//classメソッド内に記述（必須）

	}

}
