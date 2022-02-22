package easy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2798 {

	static int cardN, cardSum;
	static int[] card, result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		cardN = sc.nextInt();
		cardSum = sc.nextInt();

		card = new int[cardN];
		result = new int[3];

		for (int i = 0; i < card.length; i++) {
			card[i] = sc.nextInt();
		}

		comb(0, 0);
		System.out.println(max);
	}

	static int max = Integer.MIN_VALUE;
	public static void comb(int cnt, int start) {
		int sum=0;
		if (cnt == 3) {
			sum = result[0]+result[1]+result[2];
			if(sum<=cardSum) {
				if(sum>max) {
					max = sum;
				}
			}
			return;
		}

		for (int i = start; i < cardN; i++) {
			result[cnt] = card[i];
			comb(cnt + 1, i + 1);
		}

	}
}
