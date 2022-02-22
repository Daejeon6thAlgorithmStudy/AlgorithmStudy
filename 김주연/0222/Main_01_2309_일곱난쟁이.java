package Difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_01_2309_일곱난쟁이 {
	
	static int[] arr, num;
	static boolean[] isSelect;
	static StringBuilder sb;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr = new int[9];
		num = new int[7];
		isSelect = new boolean[9];
		sb = new StringBuilder();
		
		for(int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		combination(0, 0);
		System.out.println(sb);
	}
	
	public static void combination(int index, int cnt) {
		
		if(cnt == 7) {
			int idx = 0, sum = 0;
			for(int i=0; i<9; i++) {
				if(isSelect[i]) 
					num[idx++] = arr[i];
			}
			for(int i=0; i<7; i++) {
				sum += num[i];
			}
			if(sum == 100 && sb.length() == 0) {
				for(int i=0; i<7; i++) {
					sb.append(num[i]).append("\n");
				}
			}
			return;
		}
		
		if(index == 9) {
			return;
		}
		
		isSelect[index] = true;
		combination(index+1, cnt+1);
		isSelect[index] = false;
		combination(index+1, cnt);
	}
}
