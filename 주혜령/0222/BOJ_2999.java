package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2999 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int r = 0, c = 0;

		for (int i = 1; i <= input.length(); i++) {
			for (int j = 1; j <= input.length(); j++) {
				if ((i <= j) && (i * j == input.length())) {
					r = i;
					c = j;
				}
			}
		}

		char[][] map = new char[r][c];
		int k=0;
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				map[j][i]= input.charAt(k);
				k++;
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(map[i][j]);
			}
		}
	}

}
