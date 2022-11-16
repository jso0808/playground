package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex10829_2 {
	
	static Stack<Integer> s = new Stack<>();
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int cnt = Integer.parseInt(br.readLine());
			StringBuffer sb = new StringBuffer();
			
			for(int i=0; i<cnt; i++) {
				String str = br.readLine();
				StringTokenizer token = new StringTokenizer(str);
				
				str = token.nextToken(); // 명령어
				
				switch(str) {
				case "push":
					push(Integer.parseInt(token.nextToken()));
					break;
				case "pop":
					sb.append(pop()).append("\n");
					break;
				case "top":
					sb.append(top()).append("\n");
					break;
				case "size":
					sb.append(size()).append("\n");
					break;
				case "empty":
					sb.append(empty()).append("\n");
					break;
				}
			}
			System.out.println(sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void push(int num) {
		s.push(num);
	}
	
	public static int top() {
		if(s.size()==0) {
			return -1;
		} else {
			return s.peek();
		}
	}
	
	public static int size() {
		return s.size();
	}
	
	public static int empty() {
		if(s.size()==0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int pop() {
		if(s.size()==0) {
			return -1;
		} else {
			return s.pop();
		}
	}

}
