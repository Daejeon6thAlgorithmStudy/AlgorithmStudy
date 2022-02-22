package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_12_2810_컵홀더 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //좌석의 수
		
		String line = br.readLine();
		int cupHolder = 0;
		for(int i=0; i<N; i++) {
			if(line.charAt(i) == 'S')
				cupHolder++;
			else {
				i++;
				cupHolder++;
			}
		}
		cupHolder++;
		System.out.println(Math.min(N, cupHolder));
	}
}
