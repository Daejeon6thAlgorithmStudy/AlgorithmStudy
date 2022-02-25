package Difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_03_2578_빙고 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int[][] arr = new int[5][5];
		int[] answer = new int[25];
		
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int idx = 0;
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				answer[idx++] = Integer.parseInt(st.nextToken());
			}
		}
		
		int bingo = 0;
		int print_index = 0;
		int sum = 0;
		for(int x=0; x<25; x++) {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					
					if(arr[i][j] == answer[x]) {
						arr[i][j] = 0;
					}
					
					sum = 0;
					for(int m=0; m<5; m++) {
						sum += arr[m][j];
					}
					if(sum == 0) bingo++;
					
					sum = 0;
					for(int n=0; n<5; n++) {
						sum += arr[i][n];
					}
					if(sum == 0) bingo++;
					
					
					if(arr[2][2]==0) {
						sum = 0;
						for(int m=4; m>=0; m--) {
							for(int n=0; n<5; n++) {
								sum += arr[m][n];
							}
						}
						if(sum == 0) bingo++;
						
						sum = 0;
						for(int m=0; m<5; m++) {
							sum += arr[m][m];
						}
						if(sum == 0) bingo++;
						
					}
					
					if(bingo == 3) {
						print_index = x+1;
						break;
					}
				}
			}
		}
		System.out.println(print_index);
	}
}
