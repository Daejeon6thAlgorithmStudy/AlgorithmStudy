package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj_5397 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < TC; tc++) {
			Stack<Character> left = new Stack<>();
			Stack<Character> right = new Stack<>();

			char[] ch = br.readLine().toCharArray();

			for (int i = 0; i < ch.length; i++) {
				if (ch[i] == '<') {
					if (!left.isEmpty())
						right.push(left.pop());
				} else if (ch[i] == '>') {
					if (!right.isEmpty())
						left.push(right.pop());
				} else if (ch[i] == '-') {
					if (!left.isEmpty())
						left.pop();
				} else {
					left.push(ch[i]);
				}
			}

			while (!left.isEmpty()) {
				right.push(left.pop());
			}

			while (!right.isEmpty()) {
//				System.out.print(right.pop());
				bw.write(right.pop());
				if(right.isEmpty())
					bw.write("\n");
			}
		}
		bw.flush();
		bw.close();
	}

}
