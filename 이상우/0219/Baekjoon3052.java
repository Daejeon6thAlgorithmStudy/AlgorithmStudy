package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon3052 {
	static int A;
	static boolean[] isSelected = new boolean[42];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 10; i++) {
			A = Integer.parseInt(br.readLine());
			if (!isSelected[A % 42])
				isSelected[A % 42] = true;
		}

		int result = 0;
		for (int i = 0; i <= 41; i++)
			if (isSelected[i])
				result++;

		System.out.println(result);
	}
}
