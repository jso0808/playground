package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex1110 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int num = Integer.parseInt(br.readLine());
			int n = num;
			int cnt = 0;
			int temp=0;
			boolean b = true;
			
			while(b) {
				temp = n/10 + n%10; // 2+6=8
				n = n%10*10 + temp%10; // 60+8=68
				cnt++;
				if(n==num) {
					b = false;
				}
			}
			
			System.out.println(cnt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
