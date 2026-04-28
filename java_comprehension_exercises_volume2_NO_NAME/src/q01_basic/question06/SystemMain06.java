package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//以下
		ConsoleReader consoleReader = new ConsoleReader();
		try {
			System.out.print("input id>>");
			inputId = consoleReader.inputNumber();
		} catch (NumberFormatException e) {
			System.out.println("error!");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			System.out.println("error!");
			e.printStackTrace();
			return;
		}

		try {
			System.out.print("input password>>");
			inputPassword = consoleReader.inputString();
		} catch (IOException e) {
			System.out.println("error!");
			e.printStackTrace();
			return;
		}

		System.out.println("---SHOW MEMBER---");
		Member member = new Member(inputId, inputPassword, name, age, rank);

		member.showMember();

	}

}
