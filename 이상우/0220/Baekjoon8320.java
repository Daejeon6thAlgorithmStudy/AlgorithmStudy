package easy;

import java.util.Scanner;

public class Baekjoon8320 {
	static int N, cnt, result = 0;
	static int a, b;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			cnt = 0;
			a = 0;
			b = 1;
			for (int j = 1; j <= i; j++)
				if (i % j == 0 && a < b) {
					a = j;
					b = i / j;
					if (a <= b)
						cnt++;
				}
			result += cnt;
		}
		System.out.println(result);
	}
}