package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;



public class Ex1874 {	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			Stack<Integer> s = new Stack<>();
			
			int cnt = Integer.parseInt(br.readLine());
			int start = 0; // 이전 입력값 
			boolean b = true;
			
			while(cnt-- > 0) {
				int num = Integer.parseInt(br.readLine());
				
				if(num>start) {
					for(int i=start+1; i<=num; i++) {
						s.push(i);
						sb.append("+ \n");
					}
					start = num;
				
				} else if(s.peek()!=num) {  
					b = false;
					break;
				}
				
				s.pop();
				sb.append("- \n");
			}
			
			if(b) {
				System.out.println(sb);
			} else {
				System.out.println("NO");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
