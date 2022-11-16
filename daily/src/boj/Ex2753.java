package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex2753 {
	public static void main(String[] args) {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			
			int year = Integer.parseInt(rd.readLine());
			
			if(year%4==0 && year%100!=0 || year%400==0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
