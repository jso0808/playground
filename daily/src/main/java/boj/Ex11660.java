package src.main.java.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11660 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int loop = Integer.parseInt(st.nextToken());
        int[][] array = new int[size+1][size+1];

        for(int i=1; i<=size; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=size; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumArray = calculateSum(array, size);

        StringBuffer sb = new StringBuffer();
        for (int i=0; i<loop; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int result = sumArray[x2][y2] - sumArray[x1-1][y2] - sumArray[x2][y1-1] + sumArray[x1-1][y1-1];
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }

    private static int[][] calculateSum(int[][] array, int size) {
        int[][] rowArray = new int[size+1][size+1]; // 행 구간합
        int[][] sumArray = new int[size+1][size+1]; // 최종 구간합

        // 행 구간합 선행
        for(int i=1; i<=size; i++) {
            for (int j=1; j<=size; j++) {
                rowArray[i][j] = rowArray[i][j-1] + array[i][j];
            }
        }
        // 행 구간합의 열 구간합 구하기
        for(int i=1; i<=size; i++) {
            for (int j=1; j<=size; j++) {
                sumArray[j][i] = sumArray[j-1][i] + rowArray[j][i];
            }
        }
        return sumArray;
    }
}
