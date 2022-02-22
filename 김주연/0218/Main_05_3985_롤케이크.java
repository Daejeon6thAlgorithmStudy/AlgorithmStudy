package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_05_3985_롤케이크 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine()); //롤 케이크의 길이
		int N = Integer.parseInt(br.readLine()); //방청객의 수
		
		int arr[] = new int[L+1];
		int wish[] = new int[N+1];
		for(int i=1; i<=N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			wish[i] = end-start+1;
			for(int x=start; x<=end; x++) {
				if(arr[x] == 0) arr[x] = i;
			}
		}
		int wish_idx = 0; int wish_cake = 0;
		for(int i=0; i<wish.length; i++) {
			if(wish_cake < wish[i]) {
				wish_idx = i;
				wish_cake = wish[i];
			}
		}
		
		int[] guest = new int[N+1];
		for(int i=1; i<arr.length; i++) {
			for(int j=1; j<guest.length; j++) {
				if(arr[i] == j)
					guest[j]++;
			}
		}
		
		int max = guest[0]; int max_idx = 0;
		for(int i=1; i<guest.length; i++) {
			if(max < guest[i]) {
				max = guest[i];
				max_idx = i;
			}
		}
		
		System.out.println(wish_idx);
		System.out.println(max_idx);
	}
}
