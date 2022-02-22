package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_04_2798_블랙잭 {
	
	static int[] card, num;
	static boolean[] isSelect;
	static int N, M;
	static int ans;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		card = new int[N];
		num = new int[3];
		isSelect = new boolean[N];
		ans = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		combination(0, 0);
		System.out.println(ans);
	}
	
	public static void combination(int index, int cnt) {
		
		if(cnt == 3) {
			int idx = 0;
			for(int i=0; i<isSelect.length; i++) {
				if(isSelect[i]) {
					num[idx++] = card[i];
				}
			}
			
			int sum = 0;
			for(int i=0; i<num.length; i++) {
				sum += num[i];
			}
			if(sum<=M && sum >= ans) ans = sum;
			return;
		}
		
		if(index == N)
			return;
		
		isSelect[index] = true;
		combination(index+1, cnt+1);
		isSelect[index] = false;
		combination(index+1, cnt);
	}
}
