package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex12891 {


    private final static int ALPHABET_COUNT = 4;

    public static void main(String[] args) throws IOException {
        Ex12891 ex12891 = new Ex12891();

        System.out.println(ex12891.solve());
    }

    private int solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int partSize = Integer.parseInt(st.nextToken());
        String str = String.valueOf(br.readLine());
        int[] fitArray = inputFitArray(br);

        int[] countArray = new int[4];
        //  {‘A’, ‘C’, ‘G’, ‘T’}
        init(str, partSize, countArray);

        int result = 0;
        if(isFit(fitArray, countArray)) result++;

        for(int i=partSize; i<length; i++) {
            add(countArray, str.charAt(i));
            remove(countArray, str.charAt(i-partSize));

            boolean isFit = isFit(fitArray, countArray);
            if(isFit) result++;
        }

        return result;
    }

    private void init(String str, int partSize, int[] countArray) {
        for (int i=0; i<partSize; i++) {
            add(countArray, str.charAt(i));
        }
    }

    private int[] inputFitArray(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] fitArray = new int[4];

        for(int i=0; i<ALPHABET_COUNT; i++) {
            fitArray[i] = Integer.parseInt(st.nextToken());
        }

        return fitArray;
    }


    private boolean isFit(int [] fitArray, int [] countArray) {
        for (int i=0; i<ALPHABET_COUNT; i++) {
            if(fitArray[i] > countArray[i]) return false;
        }

        return true;
    }


    private int[] add(int[] charArray, char targetPart) {
        if (targetPart == 'A') charArray[0]++;
        else if (targetPart == 'C') charArray[1]++;
        else if (targetPart == 'G') charArray[2]++;
        else charArray[3]++;

        return charArray;
    }

    private int[] remove(int[] charArray, char targetPart) {
        if (targetPart == 'A') charArray[0]--;
        else if (targetPart == 'C') charArray[1]--;
        else if (targetPart == 'G') charArray[2]--;
        else charArray[3]--;

        return charArray;
    }


}
