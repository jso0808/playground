package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex11003 {

    public static void main(String[] args) {

    }


    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

//        int[] inputArray = inputArray(br, N);

        int[] result = new int[N]; // result

        Deque<Node> deque = new LinkedList<>();

        for(int i=0; i<N; i++) {
            int now = Integer.parseInt(st.nextToken());

            // 덱이 있으면서 now가 last보다 작으면 last remove
            while(! deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }

            // now를 last add
            deque.addLast(new Node(i, now));

            // 덱에서 인덱스를 벗어난 것들 덱에서 제거. formula 적용한 범위만 남겨야함! i-L+1 ~ i;
            if(deque.getFirst().index < i-L+1) {
                deque.removeFirst();
            }

            // 덱의 첫번째 값 출력
            result[i] = deque.getFirst().value;
        }


    }


    public class Node {
        private int index;
        private int value;

        public Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }


}
