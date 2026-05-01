package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public String inputString() throws IOException {

		System.out.print("input new password>>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String res = reader.readLine();

		return res;

	}

	public int inputNumber() throws IOException, NumberFormatException {

		System.out.print("input target id>>");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String res = reader.readLine();
		int num = Integer.parseInt(res);

		return num;
	}

}
