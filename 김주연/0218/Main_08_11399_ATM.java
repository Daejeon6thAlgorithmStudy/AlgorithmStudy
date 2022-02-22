package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_08_11399_ATM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int arr[] = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		int min[] = new int[num];
		int sum = 0;
		for (int i = 0; i < num; i++) {
			min[i] += arr[i];
			for (int j = 0; j < i; j++) {
				min[i] += arr[j];
			}
			sum += min[i];
		}
		System.out.println(sum);
	}
}
