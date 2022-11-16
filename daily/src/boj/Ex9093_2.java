package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex9093_2 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			int cnt = Integer.parseInt(br.readLine());
			
			while(cnt-- > 0) {
				String sentance = br.readLine();
				StringTokenizer token = new StringTokenizer(sentance);
				
				while(token.hasMoreElements()) {
					StringBuffer re = new StringBuffer(token.nextToken());
					sb.append(re.reverse());
					sb.append(" ");
				}
			}
			
			System.out.println(sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
