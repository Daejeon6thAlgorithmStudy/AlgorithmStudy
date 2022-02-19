package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3985 {
	static int L, N, P, K;
	static int visitorIdx = 0, realIdx = 0, expectedIdx = 0;
	static int realMax = 0, expectedMax = 0;
	static boolean isSelected[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		L = Integer.parseInt(br.readLine());
		N = Integer.parseInt(br.readLine());
		isSelected = new boolean[L + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			P = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			visitorIdx++;
			int cntCake = 0;
			for (int j = P; j <= K; j++) {
				if (!isSelected[j]) {
					isSelected[j] = true;
					cntCake++;
				}
			}

			if (cntCake > realMax) {
				realMax = cntCake;
				realIdx = i;
			}

			int expected = K - P + 1;
			if (expected > expectedMax) {
				expectedMax = expected;
				expectedIdx = i;
			}
		}
		System.out.println(expectedIdx);
		System.out.println(realIdx);
	}

}
