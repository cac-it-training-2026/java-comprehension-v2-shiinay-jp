package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber() throws IOException, NumberFormatException {
		//以下
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String res = reader.readLine();
		int num = Integer.parseInt(res);

		return num;

	}

}
