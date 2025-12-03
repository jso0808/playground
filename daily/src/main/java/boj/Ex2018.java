package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2018 {

    public static void main(String[] args) throws IOException {
        Ex2018 ex2018 = new Ex2018();
        System.out.println(ex2018.count());
    }

    private int count() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while (end != num) {
            if(sum == num) {
                count++;
                end ++;
                sum += end;
            } else if(num < sum) {
                sum -= start;
                start++;
            } else { // end < sum  앤드를 ㄷ ㅓ늘려야함
                end++;
                sum += end;
            }
        }
        return count;
    }




}
