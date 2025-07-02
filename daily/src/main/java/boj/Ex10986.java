package src.main.java.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10986 {

    public static void main(String[] args) throws IOException {
        // 데이터 입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int size = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] sumArray = new long[size+1];

        st = new StringTokenizer(bf.readLine());
        for (int i=1; i<=size; i++) {
            sumArray[i] = (sumArray[i-1] + Long.parseLong(st.nextToken())) % m;
        }

        long[] countArray = new long[m];
        for (int i=1; i<=size; i++) {
            int mod = (int) sumArray[i];
            countArray[mod]++;
        }

        int result = (int) countArray[0]; // 0으로 나누어 떨어지는 것 선카운트
        for (int i=0; i<m; i++) {
            if(countArray[i] > 1) {
                result += countArray[i] * (countArray[i] - 1) / 2; // 조합
            }
        }

        System.out.println(result);

    }
}
