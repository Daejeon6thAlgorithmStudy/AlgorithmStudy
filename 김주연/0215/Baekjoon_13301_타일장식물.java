package day0215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_13301_타일장식물 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		long arr[] = new long[num];
		
		if(num>=2) {
			arr[0] = 1;
			arr[1] = 1;
			for(int i=2; i<num; i++) {
				arr[i] = arr[i-2] + arr[i-1];
			}
		} else {
			for(int i=0; i<num; i++) {
				arr[i] = 1;
			}
		}
		
		long square;
		if(num>=2) {
			square = 2L * (long)arr[arr.length-1] + 2L * (long)(arr[arr.length-2] + arr[arr.length-1]);
		} else {
			square = 4;
		}
		
		System.out.println(square);
	}
}
