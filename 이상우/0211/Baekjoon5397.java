package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon5397 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		Stack<Character> stackL = new Stack<>();
		Stack<Character> stackR = new Stack<>();
		char[] password;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			password = br.readLine().toCharArray();
			sb = new StringBuilder();
			stackL.clear();

			for (char ch : password) {
				switch (ch) {
				case '<':
					if (!stackL.isEmpty())
						stackR.push(stackL.pop());
					break;
				case '>':
					if (!stackR.isEmpty())
						stackL.push(stackR.pop());
					break;
				case '-':
					if (!stackL.isEmpty())
						stackL.pop();
					break;
				default:
					stackL.push(ch);
				}
			}
			for (int i = 0; i < stackL.size(); i++) {
				sb.append(stackL.get(i));
			}
			while (!stackR.isEmpty())
				sb.append(stackR.pop());
			System.out.println(sb.toString());
		}

	}
}
