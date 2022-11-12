package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex9012 {
	public static void main(String[] args) {
		
		try {
			StringBuffer sb = new StringBuffer();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt = Integer.parseInt(br.readLine());
			
			while(cnt-- > 0) {
				String vps = br.readLine();
				Stack<Character> s = new Stack<>();
				boolean b = true;
				
				for(int i=0; i<vps.length(); i++) {
					if(vps.charAt(i)=='(') { 
						s.push(vps.charAt(i));
					} else { 
						if(! s.empty()) {
							s.pop();
						} else { // 닫는 괄호 시작 && 스택에 여는 괄호 없을 때
							b = false;
						}
					}
				}
				
				if(!s.empty()) { 
					b = false;
				}
				
				if(b==true) {
					sb.append("YES \n");
				} else {
					sb.append("NO \n");
				}
			}
			
			System.out.println(sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
