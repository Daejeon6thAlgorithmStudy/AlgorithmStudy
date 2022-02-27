package difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2527_직사각형 {
	static int x1, y1, x2, y2;
	static Rect[] r;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		r = new Rect[2];
		for (int tc = 0; tc < 4; tc++) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 2; i++)
				r[i] = new Rect(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
						Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

			// 겹치지 않는 경우
			if (r[0].x1 > r[1].x2 || r[0].x2 < r[1].x1 || r[0].y1 > r[1].y2 || r[0].y2 < r[1].y1)
				sb.append("d\n");
			// 점
			else if ((r[0].x1 == r[1].x2 && r[0].y1 == r[1].y2) || (r[0].x1 == r[1].x2 && r[0].y2 == r[1].y1)
					|| (r[0].x2 == r[1].x1 && r[0].y2 == r[1].y1) || (r[0].x2 == r[1].x1 && r[0].y1 == r[1].y2))
				sb.append("c\n");
			// 선분
			else if (r[0].x1 == r[1].x2 || r[0].x2 == r[1].x1 || r[0].y1 == r[1].y2 || r[0].y2 == r[1].y1)
				sb.append("b\n");
			// 직사각형
			else
				sb.append("a\n");
		}
		
		System.out.println(sb.toString());
	}

	static class Rect {
		int x1, y1, x2, y2;

		Rect(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

}
