package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon13301 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());

		long i = 1, j = 0, temp;
		for (int n = 1; n < N; n++) {
			temp = j;
			j = i;
			i += temp;
		}
		long result = (i*4) + (j*2);
		System.out.println(result);
	}
}
