package sort;

import java.util.*;

public class P2750 {
    public static void main(String[] args){
        //Scanner
        Scanner sc = new Scanner(System.in);
        // 배열 개수 ,숫자받아올 배열
        int N;

        N= sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i< N;i++){
            arr[i] = sc.nextInt();
        }
        // 이중반복문
        // 현재 배열이 오른쪽 배열보다 크면 스왑
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }        
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }

        sc.close();
     }
}
