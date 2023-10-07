package com.example.algorithm.combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 이항계수구하기 {

    /**
     *  자연수 N과 정수 K가 주어졌을 때 이항계수(n k)를 구하는 프로그램을 작성하시오
     *  입출력 예: 5 2 -> 5C2
     * */


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] data = br.readLine().split(" ");

        int fir = Integer.parseInt(data[0]);
        int sec = Integer.parseInt(data[1]);

        //dp 배열 선언
        int[][] D = new int[fir+1][fir+1];


        for(int i=0; i<=fir; i++){
            D[i][i] = 1;
            D[i][0] = 1;
            D[i][1] = i;
        }

        for(int i=2; i<=fir; i++){
            for(int j=1; j<i; j++){
                D[i][j] = D[i-1][j] + D[i-1][j-1];
            }
        }

        System.out.println(D[fir][sec]);



    }


}
