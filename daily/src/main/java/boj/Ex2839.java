package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex2839 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int sugar = Integer.parseInt(br.readLine());
			int cnt = 0;

			while (true) {
				if (sugar % 5 == 0) {
					cnt += sugar / 5;
					sugar %= 5;
					break;
				} else if (sugar % 5 != 0) {
					if (sugar < 3) {
						cnt = -1;
						break;
					}
					sugar -= 3;
					cnt++;
				}
			}
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
