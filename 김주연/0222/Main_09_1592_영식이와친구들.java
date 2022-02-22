package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_09_1592_영식이와친구들 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		int friends[] = new int[N];
		int round[] = new int[N];
		int count = 0;
		int ball = 0;
		
		for(int i=0; i<N; i++) {
			friends[i] = i+1;
		}
		round[0]++;
		count++;
		while(true) {
			if(round[ball] == M)
				break;
			
			if(round[ball]%2 == 1) {
				ball += L;
				ball %= N;
				round[ball]++;
				count++;
			}else {
				if(ball-L < 0) {
					ball = friends.length - (L-ball);
					ball %= N;
					round[ball]++;
					count++;
				}
				else {
					ball -= L;
					ball %= N;
					round[ball]++;
					count++;
				}
			}	
		}
		System.out.println(--count);
	}
}
