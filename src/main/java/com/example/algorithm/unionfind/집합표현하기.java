package com.example.algorithm.unionfind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 집합표현하기 {

    /**
     *
     * n = 원소의 개수
     * m = 연산의 개수
     *
     * */


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] nArr = new int[n+1];

        for(int i=0; i<nArr.length; i++){
            nArr[i] = i;
        }


        for(int i=0; i<m; i++){
            String[] tempArr = br.readLine().split(" ");
            int fir = Integer.parseInt(tempArr[0]);
            int start = Integer.parseInt(tempArr[1]);
            int end = Integer.parseInt(tempArr[2]);

            if(fir == 0) {
                nArr[start] = nArr[end];
            }

            if(fir == 1) {
                if (nArr[start] == nArr[end]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }

        }





    }

}
