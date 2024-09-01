package baekjoon.page5.Q5656;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String operator = st.nextToken();
            int b = Integer.parseInt(st.nextToken());

            if (operator.equals("E")) {
                break;
            }

            if (calculate(a, operator, b)) {
                bw.write("Case " + count + ": true\n");
            }

            if (!calculate(a, operator, b)) {
                bw.write("Case " + count + ": false\n");
            }

            count++;
            bw.flush();
        }

        bw.close();
        br.close();
    }

    private static boolean calculate(int a, String operator, int b) {

        boolean result = false;

        if (operator.equals(">")) {
            result = a > b;
            return result;
        }

        if (operator.equals(">=")) {
            result = a >= b;
            return result;
        }

        if (operator.equals("<")) {
            result = a < b;
            return result;
        }

        if (operator.equals("<=")) {
            result = a <= b;
            return result;
        }

        if (operator.equals("==")) {
            result = a == b;
            return result;
        }

        if (operator.equals("!=")) {
            result = a != b;
            return result;
        }

        return result;
    }
}
