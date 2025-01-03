package datastruc.R1;
import java.io.*;
import java.util.*;

public class P11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sT = new StringTokenizer(bR.readLine());
        int arrNum = Integer.parseInt(sT.nextToken());
        int queryNum = Integer.parseInt(sT.nextToken());
        long S[] = new long[arrNum+1];

        sT = new StringTokenizer(bR.readLine());
        for(int i=1;i<=arrNum;i++){
            S[i] = S[i-1]+Integer.parseInt(sT.nextToken());
        }
        for(int l=0;l<queryNum;l++){
            sT = new StringTokenizer(bR.readLine());
            int i = Integer.parseInt(sT.nextToken());
            int j = Integer.parseInt(sT.nextToken());
            System.out.println(S[j]-S[i-1]);
        }
        
    }
}
