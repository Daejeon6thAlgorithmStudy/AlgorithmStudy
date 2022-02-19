package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		String s = br.readLine();
		char ch;
		boolean reverse = true;
		for (int i = 0, size = s.length(); i < size; i++) {
			ch = s.charAt(i);
			if (ch == '<') {
				while (!stack.isEmpty())
					sb.append(stack.pop());
				sb.append(ch);
				reverse = false;
				continue;
			} else if (ch == '>') {
				sb.append(ch);
				reverse = true;
				continue;
			} else if (ch == ' ') {
				while (!stack.isEmpty())
					sb.append(stack.pop());
				sb.append(ch);
				continue;
			} else {
				if (reverse)
					stack.push(ch);
				else
					sb.append(ch);
			}
		}
		while (!stack.isEmpty())
			sb.append(stack.pop());
		
		System.out.println(sb.toString());
	}
}
