package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_02_2999_비밀이메일 {
	
	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String message = br.readLine();
		int row = 1, column = 1;
		char password[][];
		
		for(int i=1; i<message.length(); i++) {
			if(message.length()%i == 0 && i<= message.length()/i) {
				row = i;
				column = message.length()/i;
			}
		}
		
		password = new char[row][column];
		
		int index = 0;
		for(int i=0; i<column; i++) {
			for(int j=0; j<row; j++) {
				password[j][i] = message.charAt(index);
				index++;
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(password[i][j]);
			}
		}
	}
}
