package datastruc.R1;

import java.util.*;

public class P11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        // 문자열 선언 char cNum[] 실수
        char cNum[] = sNum.toCharArray();
        int sum=0;
        for(int i=0;i<N;i++){
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
        sc.close();

    }

}
