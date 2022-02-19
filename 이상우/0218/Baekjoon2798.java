package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2798 {
	static int N, M, cards[], result = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		cards = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			cards[i] = Integer.parseInt(st.nextToken());
		combination(0, 0, 0);
		
		System.out.println(result);
	}

	public static void combination(int cnt, int start, int sum) {
		if (cnt == 3) {
			if(result < sum) result = sum;
			return;
		}
		for (int i = start; i < N; i++) {
			if(sum + cards[i] > M) continue;
			combination(cnt + 1, i + 1, sum + cards[i]);
		}
	}
}
