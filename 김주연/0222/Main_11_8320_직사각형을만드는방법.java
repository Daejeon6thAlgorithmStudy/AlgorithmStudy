package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11_8320_직사각형을만드는방법 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i=1; i<=N; i++) {
			for(int j=i; j<=N; j++) {
			if(i*j <= N) count++;
			}
		}
		System.out.println(count);
	}
}
