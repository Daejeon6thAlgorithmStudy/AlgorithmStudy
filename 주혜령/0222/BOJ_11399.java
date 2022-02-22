package easy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11399 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] person = new int[n];
		
		for(int i=0;i<n;i++) {
			person[i] = sc.nextInt();
		}
		
		Arrays.sort(person);
		
		int time=0;
		for(int i=0;i<person.length;i++) {
			for(int j=i;j<person.length;j++) {
				time+=person[i];
			}
		}
		
		System.out.println(time);
	}

}
