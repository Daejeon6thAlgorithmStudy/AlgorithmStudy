package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1592 {
	static int N, M, L, input[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
		}

		input = new int[N + 1];
		int player = 1;
		input[player]++; // 처음 받는 공 횟수 추가
		int playCnt = 0; // 공 던진 횟수
		while (input[player] != M) { // 방금 받은 놈이 M번이면 종료
			playCnt++; // 공 던져!

			if (input[player] % 2 == 1)
				player += L;
			else
				player += (N - L);

			if (player > N)
				player %= N;
			++input[player];
		}

		System.out.println(playCnt);
	}
}
