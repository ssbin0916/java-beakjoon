package baekjoon.page10.Q10988;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String palindrome = br.readLine();
        bw.write(String.valueOf(isPalindrome(palindrome)));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int isPalindrome(String str) {
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return 0;
            }
        }
        return 1;
    }
}
