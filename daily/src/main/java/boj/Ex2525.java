package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2525 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String t = br.readLine();
			int cooking = Integer.parseInt(br.readLine());
			
			StringTokenizer token = new StringTokenizer(t);
			int h = Integer.parseInt(token.nextToken());
			int m = Integer.parseInt(token.nextToken());
			
			m += cooking;
			
			if(m > 59) {
				h += m/60;
				m = m%60;
				if(h > 23) {
					h -= 24;
				}
			} 

			System.out.println(h + " " + m);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
