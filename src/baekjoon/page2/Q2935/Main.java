package baekjoon.page2.Q2935;

import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a = new BigInteger(br.readLine());
        String operator = br.readLine();
        BigInteger b = new BigInteger(br.readLine());

        BigInteger result = calculate(a, operator, b);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }

    private static BigInteger calculate(BigInteger a, String operator, BigInteger b) {

        BigInteger result = BigInteger.ZERO;

        if (operator.equals("+")) {
            result = a.add(b);
            return result;
        }

        if (operator.equals("*")) {
            result = a.multiply(b);
            return result;
        }

        return result;
    }
}
