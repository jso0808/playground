package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex1940 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			int m = Integer.parseInt(br.readLine());
			int[] a = new int[n];
			int cnt = 0;
			int min = 0;
			int max = n-1;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(a);
	
			while(min < max) {
				if(a[min]+a[max] < m) {
					min++;
				} else if(a[min]+a[max] > m) {
					max--;
				} else {
					cnt++;
					min++;
					max--;
				}
			}
			
			System.out.println(cnt);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
