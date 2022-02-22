package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		for(int tc=0;tc<TC;tc++) {
			
			char[] input = br.readLine().toCharArray();
			
			int score=0;
			int cnt=0;
			for(int i=0;i<input.length;i++) {
				if(input[i]=='O') {
					score += (cnt+1);
					cnt++;
				}else
					cnt=0;
			}
			
			System.out.println(score);
		}
	}

}
