package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2480 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String num = br.readLine();
			
			StringTokenizer token = new StringTokenizer(num);
			
			int n1 = Integer.parseInt(token.nextToken());
			int n2 = Integer.parseInt(token.nextToken());
			int n3 = Integer.parseInt(token.nextToken());
			int money=0;
			
			if(n1!=n2 && n1!=n3 && n2!=n3) { // 모두 다른 눈
				money = Math.max(n1, Math.max(n2, n3)) *100;
			} else { // 같은 눈 존재
				if(n1==n2 && n2==n3 && n3==n1) { // 모두 같은 눈
					money = 10000 + n1*1000;
				} else {						// 같은 눈 2개
					if(n1==n2 || n1==n3) {
						money = 1000 + n1*100;
					} else if(n2==n3) {
						money = 1000 + n2*100;
					}
				}
				
			}
			System.out.println(money);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
