package difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2563_색종이 {
	static int N, n1, n2;
	static boolean[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		map = new boolean[101][101];

		N = Integer.parseInt(br.readLine());
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			n1 = Integer.parseInt(st.nextToken());
			n2 = Integer.parseInt(st.nextToken());
			for (int i = n1; i < n1 + 10; i++) {
				for (int j = n2; j < n2 + 10; j++) {
					map[i][j] = true;
				}
			}
		}

		int result = 0;
		for (int i = 0; i < 100; i++)
			for (int j = 0; j < 100; j++)
				if (map[i][j])
					result++;

		System.out.println(result);
	}
}
