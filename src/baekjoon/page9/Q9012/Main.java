package baekjoon.page9.Q9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());


        for (int i = 0; i < t; i++) {
            String line = br.readLine();
            System.out.println(isVPS(line));
        }

    }

    private static String isVPS(String string) {
        int balance = 0;

        for (char ch : string.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else {
                balance--;
                if (balance < 0) {
                    return "NO";
                }
            }
        }

        return balance == 0 ? "YES" : "NO";
    }

}
