package Easy;

import java.util.Scanner;

public class Main_06_3052_나머지 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean arr[] = new boolean[42];
		
		for(int i=1; i<=10; i++) {
			int n = sc.nextInt()%42;
			arr[n] = true;
		}
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i])
				count++;
		}
		System.out.println(count);
	}
}
