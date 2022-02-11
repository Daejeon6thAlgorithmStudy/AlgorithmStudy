package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj_1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			left.push(str.charAt(i));
		}

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char order = st.nextToken().charAt(0);

			if (order == 'P') {
				char addChar = st.nextToken().charAt(0);
				left.push(addChar);
			} else if (order == 'B') {
				if (!left.isEmpty())
					left.pop();
			} else if (order == 'L') {
				if (!left.isEmpty())
					right.push(left.pop());
			} else if (order == 'D') {
				if (!right.isEmpty())
					left.push(right.pop());
			}
		}

		while (!left.isEmpty()) {
			right.push(left.pop());
		}

		while (!right.isEmpty()) {
			bw.write(right.pop());
		}
		bw.flush();
		bw.close();
	}

}
