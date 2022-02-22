package easy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_3985 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int per = sc.nextInt();

		int[] share = new int[L + 1];
		int minus = Integer.MIN_VALUE;
		int minus_p = 0;
		for (int i = 1; i <= per; i++) {

			int min = sc.nextInt();
			int max = sc.nextInt();

			if (minus < max - min) {
				minus = max-min;
				minus_p = i;
			}
			for (int j = min; j <= max; j++) {
				if (share[j] == 0)
					share[j] = i;
			}

		}

		int[] result = new int[per+1];
		for(int i=1;i<share.length;i++) {
			result[share[i]]++;
		}
		
		int max = 0;
		int max_p = 0;
		for(int i=1;i<result.length;i++) {
			if(max<result[i]) {
				max = result[i];
				max_p = i;
			}
		}
		System.out.println(minus_p);
		System.out.println(max_p);
	}

}
