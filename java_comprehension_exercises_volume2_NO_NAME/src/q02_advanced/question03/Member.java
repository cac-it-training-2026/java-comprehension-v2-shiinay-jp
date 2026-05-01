package q02_advanced.question03;

import java.util.ArrayList;
import java.util.List;

public class Member {

	//フィールド
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

	//コンストラクタ
	/**
		 * 
		 */
	public Member() {
	}

	/**
		 * @param id
		 * @param password
		 * @param name
		 * @param age
		 * @param rank
		 * @param coupons
		 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		coupons = new ArrayList<>();

	}

	//アクセスメソッド
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return coupons
	 */
	List<Coupon> getCoupons() {

		return coupons;
	}

	/**
	 * @param coupons セットする coupons
	 */
	void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	//メソッド
	public static Member getInstance(int id, String password, String name, int age, int rank) {

		Member member = new Member(id, password, name, age, rank);
		member.getCoupons().add(Coupon.getInstance(1, 0.5, "最初の特典"));
		member.getCoupons().add(Coupon.getInstance(2, 0.25, "今月の特典"));

		return member;

	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ ", coupons=" + coupons + "]";
	}

	public void showMember() {

		System.out.println(toString());
		System.out.println("******************");

	}

}
