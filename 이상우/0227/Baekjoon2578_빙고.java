package difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2578_빙고 {
	static int[][] map;
	static boolean[][] visit;
	static int order, bingoCnt = 0, result = 0;
	static int[] dI = { 1, 0, 1, 1 }, dJ = { 1, 1, 0, -1 }; // 00대각선, 행 가로, 열 세로, 05대각선

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		map = new int[5][5];
		visit = new boolean[5][5];
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				order = Integer.parseInt(st.nextToken());
				result++;
				for (int n = 0; n < 5; n++) {
					for (int m = 0; m < 5; m++) {
						if (order == map[n][m]) {
							visit[n][m] = true;
							if (check()) {
								System.out.println(result);
								return;
							}
						}
					}
				}
			}
		}

	}

	static boolean check() {
		int bingoCnt = 0;

		int i = 0, j = 0;
		// 대각선 검사
		if (visit[i][j] && bingo(i, j, 0))
			bingoCnt++;

		// 행 가로 검사
		for (i = 0, j = 0; i < 5; i++)
			if (visit[i][j] && bingo(i, j, 1))
				bingoCnt++;

		// 열 세로 검사
		for (i = 0, j = 0; j < 5; j++)
			if (visit[i][j] && bingo(i, j, 2))
				bingoCnt++;

		// 05대각선검사
		i = 0; j =4;
		if (visit[i][j] && bingo(i, j, 3))
			bingoCnt++;

		if (bingoCnt >= 3)
			return true;
		return false;
	}

	static boolean bingo(int i, int j, int mode) {
		int nextI = i, nextJ = j;
		int cnt = 1;
		while (true) {
			nextI += dI[mode];
			nextJ += dJ[mode];
			if (nextI < 0 || nextI >= 5 || nextJ < 0 || nextJ >= 5)	break;
			if (visit[nextI][nextJ]) cnt++;
			else break;
		}
		if (cnt == 5)
			return true;
		return false;
	}

}
