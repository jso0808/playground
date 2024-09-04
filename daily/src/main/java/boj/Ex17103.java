package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex17103 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb = new StringBuilder();
			int cycle = Integer.parseInt(br.readLine());
			int max = 1_000_000;
			boolean chk[] = new boolean[max+1]; // 소수를 체크할 배열
			
			for(int i=0; i<=max; i++) {
				chk[i] = false;
			}
			// 0과 1은 소수가 아님으로 시작
			chk[0] = true; 
			chk[1] = true;
			
			for(int i=2; i*i<=max; i++) {
				for(int j=i*i; j<=max; j+=i) {
					if(chk[j]) { // 이미 소수라고 판별되어있으면
						continue;
					} 
					chk[j] = true;
				}
			}

			while (cycle > 0) {
				cycle--;

				int n = Integer.parseInt(br.readLine());
				
				int cnt = 0;
				
				for (int i = 2; i <= n/2; i++) { 
					if(chk[n-i]==false && chk[i]==false) {
						cnt++;
					}
				}
				
				sb.append(cnt + "\n");
			}

			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
