package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex9093_4 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			int cnt = Integer.parseInt(br.readLine());
			Stack<Character> s = new Stack<>();

			while (cnt-- > 0) {
				String sentance = br.readLine()+" ";
				for (int i = 0; i < sentance.length(); i++) {
					if (sentance.charAt(i) == ' ') {
						while (!s.empty()) {
							sb.append(s.pop());
						}
						sb.append(" ");
					} else {
						s.push(sentance.charAt(i));
					}

				}

			}

			System.out.println(sb);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
