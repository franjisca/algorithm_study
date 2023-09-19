package com.example.algorithm.decimal;

import java.util.Scanner;

public class 소수구하기 {

    /**
     * 소수는 에라토스테네스의 체를 이용
     * */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = Integer.parseInt(sc.nextLine());
        int N = Integer.parseInt(sc.nextLine());

        int[] arr = new int[N+1];

        for(int i=2; i<arr.length; i++){
            arr[i] = i;
        }

        for(int i=2; (i*i)<=N; i++){

            if(arr[i] == 0) continue;

            for(int j=i+i; j<=N; j = j+i){
                arr[j] = 0;
            }

        }

        for(int i=M; i< arr.length; i++){
            if(arr[i] == 0 ) continue;
            System.out.println(arr[i]);
        }

    }
}
