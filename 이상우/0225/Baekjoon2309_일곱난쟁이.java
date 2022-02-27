package difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2309_일곱난쟁이 {
	static int input[], output[], sum = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = new int[9];
		output = new int[7];
		for (int i = 0; i < 9; i++)
			input[i] = Integer.parseInt(br.readLine());

		Arrays.sort(input);
		com(0, 0, 0);
	}

	public static void com(int cnt, int start, int sum) {
		if (cnt == 7) {
			if (sum == 100) {
				for(int i=0; i<7; i++) 
					sb.append(output[i]).append("\n");
				System.out.println(sb);
				System.exit(0);
			}
			return;
		}
		for (int i = start; i < 9; i++) {
			output[cnt] = input[i];
			com(cnt + 1, start + 1, sum + input[i]);
		}
	}
}
