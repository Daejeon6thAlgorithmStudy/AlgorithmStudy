package difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2564_경비원 {
	static int W, H, N, mD, mL, oD, oL, result;
	static int[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(br.readLine());

		map = new int[N][2]; // 자신의 좌표까지 저장

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			map[n][0] = Integer.parseInt(st.nextToken());
			map[n][1] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		mD = Integer.parseInt(st.nextToken()); // 내 방위
		mL = Integer.parseInt(st.nextToken()); // 나의 위치

		// 북 : 1, 남 : 2, 서 : 3, 동 : 4
		result = 0;
		for (int n = 0; n < N; n++) {
			oD = map[n][0];
			oL = map[n][1];

			if (mD == 1 || mD == 2) { // 내 방위가 북 or 남일때
				if (oD == 3) { // 상점이 서쪽일때
					if (mD == 1)
						result += (mL + oL);
					else
						result += (mL + (H - oL));
				} else if (oD == 4) { // 상점이 동쪽일때
					if (mD == 1)
						result += ((W - mL) + oL);
					else
						result += ((W - mL) + (H - oL));
				} else if (mD == oD) // 북 or 남 같은 방위일때
					result += Math.abs(mL - oL);
				else { // 다른 방위일때
					if (mL + oL <= W)
						result += (mL + oL + H);
					else
						result += ((W - mL) + (W - oL) + H);
				}
			} else { // 내 방위가 서 or 동일때
				if (oD == 1) { // 상점이 북일때
					if (mD == 3) // 내가 서일때
						result += (mL + oL);
					else
						result += (mL + (W - oL));
				} else if (oD == 2) { // 상점이 남일때
					if (mD == 3)
						result += ((H - mL) + oL);
					else
						result += ((H - mL) + (W - oL));
				} else if (mD == oD) // 서 or 동 같은 방위일때
					result += Math.abs(mL - oL);
				else { // 다른 방위일때
					if (mL + oL <= H)
						result += (mL + oL + W);
					else
						result += ((H - mL) + (H - oL) + W);
				}
			}
		}
		
		System.out.println(result);

	}
}
