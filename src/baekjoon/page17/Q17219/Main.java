package baekjoon.page17.Q17219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        Map<String, String> passwordMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) {
                continue;
            }

            stringTokenizer =  new StringTokenizer(line);
            String site = stringTokenizer.nextToken();
            String password = stringTokenizer.nextToken();
            passwordMap.put(site, password);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (query == null || query.isEmpty()) {
                continue;
            }
            result.append(passwordMap.getOrDefault(query, "NOT FOUND")).append("\n");
        }
        System.out.print(result);
    }
}