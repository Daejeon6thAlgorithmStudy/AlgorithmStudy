package difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon2605_줄세우기 {
	static int N;
	static LinkedList<Integer> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		N = Integer.parseInt(br.readLine());
		list = new LinkedList<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			int order = Integer.parseInt(st.nextToken());
			list.add(list.size()-order, i);
		}
		for(int i : list) 
			System.out.print(i + " ");
	}
}
