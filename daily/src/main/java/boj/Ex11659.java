package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 size와 입력문제 갯수 받아오기
        int size = Integer.parseInt(st.nextToken());
        int countToSolve = Integer.parseInt(st.nextToken());
        int[] array = new int[size+1];

        // 입력문제 갯수만큼 반복문 돌며 array 받고 구간합배열 만들기
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=size; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if(i>1) array[i] = array[i-1] + array[i];
        }

        // 구간 합 구하기
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<countToSolve; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int result = array[end] - array[start-1];
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
