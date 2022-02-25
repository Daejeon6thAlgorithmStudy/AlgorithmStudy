package Difficult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_12_13300_방배정 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //전체 학생수
		int K = Integer.parseInt(st.nextToken()); //한 방에 배정할 수 있는 최대 인원수
		
		int[][] students = new int[2][6];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken()); //성별
			int Y = Integer.parseInt(st.nextToken()); //학년
			
			students[S][Y-1]++;
		}
		
		int rooms = 0;
		for(int i=0; i<2; i++) {
			for(int j=0; j<6; j++) {
				if(students[i][j] != 0) {
					rooms += students[i][j] / K + students[i][j] % K;
				}
			}
		}
		System.out.println(rooms);
	}
}
