package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_07_8958_OX퀴즈 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		
		for(int x=1; x<=TC; x++) {
			String line = br.readLine();
			char arr[] = new char[line.length()];
			for(int i=0; i<arr.length; i++) {
				arr[i] = line.charAt(i);
			}
			int score = 1;
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == 'O') {
					sum += score;
					score++;
				} else {
					score = 1;
				}
			}
			System.out.println(sum);
		}
	}
}
