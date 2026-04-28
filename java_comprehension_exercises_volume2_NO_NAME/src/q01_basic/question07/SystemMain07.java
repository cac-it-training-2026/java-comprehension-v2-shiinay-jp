package q01_basic.question07;

import java.io.IOException;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//以下
		ConsoleReader consoleReader = new ConsoleReader();
		try {
			limit = consoleReader.inputNumber();
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return;
		}

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//以下
		numberList.addFromOneTo(limit);
		sum = numberList.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		//TODO ここから実装する
		numberList.doubleListEachValue();

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する
		numberList.removeIndexOfFirstHalf();

	}

}
