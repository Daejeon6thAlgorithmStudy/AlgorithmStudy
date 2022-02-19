package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr = br.readLine().toCharArray();
		int cnt = 0;
		char now;
		for (int i = 0, size = arr.length; i < size; i++) {
			now = arr[i];
			if (now == 'c') {
				if (i + 1 < size && (arr[i + 1] == '=' || arr[i + 1] == '-'))
					i++;
				cnt++;
			} else if (now == 'd') {
				if (i + 2 < size && arr[i + 1] == 'z' && arr[i + 2] == '=')
					i += 2;
				else if (i + 1 < size && arr[i + 1] == '-')
					i++;
				cnt++;
			} else if (now == 'l' || now == 'n') {
				if (i + 1 < size && arr[i + 1] == 'j')
					i++;
				cnt++;
			} else if (now == 's' || now == 'z') {
				if (i + 1 < size && arr[i + 1] == '=')
					i++;
				cnt++;
			} else {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
