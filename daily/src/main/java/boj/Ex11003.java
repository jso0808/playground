package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex11003 {

    public static void main(String[] args) throws IOException {
        Ex11003 ex11003 = new Ex11003();
        ex11003.solve();
    }


    private void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] result = new int[N];

        Deque<Node> deque = new LinkedList<>();

        for(int i=0; i<N; i++) {
            int now = Integer.parseInt(st.nextToken());

            // 덱 마지막에서부터 now보다 큰 노드는 제거
            while(! deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }

            // now를 last add
            deque.addLast(new Node(i, now));

            // 덱에서 인덱스를 벗어난 것들 덱에서 제거. formula 적용한 범위만 남겨야함! i-L+1 < inedx < i;
            if(deque.getFirst().index < i-L+1) {
                deque.removeFirst();
            }

            result[i] = deque.getFirst().value;
        }

        for (int i : result) {
            System.out.print(i + " ");
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
