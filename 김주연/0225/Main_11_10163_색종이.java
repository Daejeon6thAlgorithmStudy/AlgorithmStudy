package Difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11_10163_색종이 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] map = new int[1001][1001];
		
		int N = Integer.parseInt(br.readLine());
		
		for(int n=1; n<=N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int xSize = Integer.parseInt(st.nextToken());
			int ySize = Integer.parseInt(st.nextToken());
			
			for(int i=x; i<x+xSize; i++) {
				for(int j=y; j<y+ySize; j++) {
					map[i][j] = n;
				}
			}
		}
		
		int sum = 0;
		for(int n=1; n<=N; n++) {
			for(int i=0; i<1001; i++) {
				for(int j=0; j<1001; j++) {
					if(map[i][j] == n)
						sum++;
				}
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}
