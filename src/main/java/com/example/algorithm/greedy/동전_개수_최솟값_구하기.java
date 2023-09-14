package com.example.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 동전_개수_최솟값_구하기 {

/**
    준규가 소유하고 있는 동전 총 n 종류
    동전 종류를 적절히 사용하여 가격의 합 k를 만들려고 함
    이때 필요한 동전 개수의 최솟값을 구하는 프로그램 작성하기*/

    public static void main(String[] args) throws IOException {


        int count = 0;

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int K = Integer.parseInt(sc.nextLine());

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        for(int j=N-1; j>=0; j--){
            if(arr[j] <= K){
                count += (K/arr[j]);
                K = K % arr[j];
            }
        }

        System.out.println(count);




    }
}
