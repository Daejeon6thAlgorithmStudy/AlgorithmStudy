package Difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_02_2605_줄세우기 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int students = Integer.parseInt(br.readLine());
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		int num = 1;
		
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<students; i++) {
			list.add(list.size()-Integer.parseInt(st.nextToken()), num++);
		}
		
		for(int i=0; i<students; i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
