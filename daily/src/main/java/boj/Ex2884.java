package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2884 {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String t = br.readLine();
			
			StringTokenizer token = new StringTokenizer(t);
			
			int h = Integer.parseInt(token.nextToken());
			int m = Integer.parseInt(token.nextToken());
			
			m -= 45;
			
			if(m < 0) {
				if(h-1 < 0) {
					h = 23;
				} else {
					h -= 1;
				}
				m = 60+m;
			} 
			
			System.out.println(h + " " + m);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
