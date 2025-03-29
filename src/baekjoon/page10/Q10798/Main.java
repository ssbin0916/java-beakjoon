package baekjoon.page10.Q10798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> stringList = new ArrayList<>();
        int maxLength = 0;
        int number = 5;

        for (int i = 0; i < number; i++) {
            String line = br.readLine();
            stringList.add(line);
            maxLength = Math.max(maxLength, line.length());
        }

        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (String str : stringList) {
                if (i < str.length()) {
                    sb.append(str.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
