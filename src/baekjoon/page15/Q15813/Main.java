package baekjoon.page15.Q15813;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nameLength = Integer.parseInt(br.readLine());
        String name = br.readLine();

        char[] nameArray = name.toCharArray();

        int nameScore = 0;

        for (int i = 0; i < nameLength; i++) {
            nameScore += getAlphabetScore(nameArray[i]);
        }

        bw.write(String.valueOf(nameScore));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int getAlphabetScore(char character) {

        int result = 0;

        if (character >= 'A' && character <= 'Z') {
            result = character - 'A' + 1;
            return result;
        }
        return result;
    }
}
