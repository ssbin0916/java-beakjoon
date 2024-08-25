package baekjoon.page13.Q13420;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            String operator = st.nextToken();
            long b = Long.parseLong(st.nextToken());
            st.nextToken();
            long result = Long.parseLong(st.nextToken());

            boolean isCurrent = (calculate(operator, a, b) == result);
            bw.write(isCurrent ? "correct" : "wrong answer");
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static long calculate(String operator, long a, long b) {

        long result = 0;

        if (operator.equals("+")) {
            result = a + b;
            return result;
        }

        if (operator.equals("-")) {
            result = a - b;
            return result;
        }

        if (operator.equals("*")) {
            result = a * b;
            return result;
        }

        if (operator.equals("/")) {
            result = a / b;
            return result;
        }

        return result;
    }
}
