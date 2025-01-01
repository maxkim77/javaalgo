package dfsbfs.R1;
import java.io.*;
import java.util.*;

public class P11724 {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 입력값 검증
        if (input == null || input.trim().isEmpty()) {
            System.err.println("Invalid input: Input cannot be null or empty.");
            return;
        }

        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = (ArrayList<Integer>[]) new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            input = br.readLine();
            if (input == null || input.trim().isEmpty()) {
                System.err.println("Invalid edge input at line " + (i + 1));
                return;
            }
            st = new StringTokenizer(input);
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

    static void dfs(int v) {
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
