package baekjoon.page5.Q5532;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int remainKor = A % C;
        int remainMath = B % D;
        int korDate = A / C;
        int mathDate = B / D;

        if (remainKor != 0) {
            korDate++;
        }

        if (remainMath != 0) {
            mathDate++;
        }


        int max = Math.max(korDate, mathDate);

        int result = L - max;

        System.out.println(result);
    }
}
