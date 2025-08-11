package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Ex4659 {


    /*
        비밀번호 발음하기

        - 모음 (a e i o u)  << 반드시 1개 포함
        - 모음 3개 연속 불가, 자음 3개 연속 불가
        - ee oo 제외, 같은 글자 연속 불가
     */

    private static final Set<Character> VOWEL_LIST = Set.of('a', 'e', 'i', 'o', 'u');
    private static final List<String> ALLOW_EXCEPTION_LIST = List.of("oo", "ee");

    public boolean hasVowel(String password) {
        for (char vowel : VOWEL_LIST) {
            if(password.contains(String.valueOf(vowel))) return true;
        }

        return false;
    }


    public boolean hasTripleType(String password) {
        int vowelCount = 1; // 모음
        int consonantCount = 1; // 자음

        char previousChar =  password.charAt(0);

        for(int i = 1; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            if(isChangeType(previousChar, currentChar)) {
               vowelCount=1; consonantCount=1; // reset
            } else {
                if(isVowel(currentChar)) vowelCount++;
                else consonantCount++;
            }

            if(vowelCount>2 || consonantCount >2) return true;
        }

        return vowelCount>=3 || consonantCount >=3;
    }


    private boolean isChangeType(char previousChar, char currentChar) {
        if(isVowel(previousChar) && isVowel(currentChar)) return false;
        if(!isVowel(previousChar) && !isVowel(currentChar)) return false;
        return true;
    }

    private boolean hasDoubleSameChar(String password) {
        if(password.length() < 2) return false;

        char previousChar =  password.charAt(0);

        for(int i=1; i<password.length(); i++) {
            char currentChar = password.charAt(i);
            if(Objects.equals(previousChar, currentChar) && ! isAllowWhenDoubleChar(currentChar)) {
                return true;
            }

            previousChar = currentChar;
        }

        return false;
    }

    private boolean isAllowWhenDoubleChar(char currentChar) {
        return ALLOW_EXCEPTION_LIST.contains(String.valueOf(currentChar));
    }


    private boolean isVowel(char character) {
        return VOWEL_LIST.contains(character);
    }

    public static void main(String[] args) throws IOException {
        Ex4659 ex4659 = new Ex4659();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        boolean hasVowel = ex4659.hasVowel(input);
        boolean hasDoubleSameChar = ex4659.hasDoubleSameChar(input);
        boolean hasTripleType = ex4659.hasTripleType(input);

        if( hasVowel && !hasDoubleSameChar && !hasTripleType ) {
            System.out.println("<"+input+"> is acceptable.");
        } else {
            System.out.println("<"+input+"> is not acceptable.");
        }
    }

}
