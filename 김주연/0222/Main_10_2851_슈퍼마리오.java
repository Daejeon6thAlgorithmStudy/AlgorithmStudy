package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10_2851_슈퍼마리오 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] mushroom = new int[10];
		
		for(int x=0; x<10; x++) {
			mushroom[x] = Integer.parseInt(br.readLine());
		}
		
		int sum = 0; int index = 0;
		for(int i=0; i<10; i++) {
			sum += mushroom[i];
			if(sum >= 100) {
				index = i;
				break;
			}
		}
		
		if(sum == 100) System.out.println(sum);
		else {
			if(100 - (sum - mushroom[index]) < sum - 100) System.out.println(sum-mushroom[index]);
			else if(100-(sum-mushroom[index]) > sum-100) System.out.println(sum);
			else System.out.println(sum);
		}
	}
}
