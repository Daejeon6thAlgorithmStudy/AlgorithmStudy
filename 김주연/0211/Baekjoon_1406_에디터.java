package day0211;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon_1406_에디터 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		String line = br.readLine();
		
		for(int i=0; i<line.length(); i++) {
			stack1.push(line.charAt(i));
		}
		
		int orderNum = Integer.parseInt(br.readLine());
		for(int x=0; x<orderNum; x++) {
			
			line = br.readLine();
			if(line.charAt(0) == 'L') {
				if(stack1.isEmpty()) continue;
				
				stack2.push(stack1.pop());
			}
			else if(line.charAt(0) == 'D') {
				if(stack2.isEmpty()) continue;
				
				stack1.push(stack2.pop());
			}
			else if(line.charAt(0) == 'B') {
				if(stack1.isEmpty()) continue;
				
				stack1.pop();
			}
			else if(line.charAt(0) == 'P') {
				stack1.push(line.charAt(2));
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<stack1.size(); i++) {
			sb.append(stack1.get(i));
		}
		
		while(!stack2.isEmpty()) {
			sb.append(stack2.pop());
		}
		System.out.println(sb);
	}
}
