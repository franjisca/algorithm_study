package com.example.algorithm.dynamicprogramming;

import java.util.Scanner;

public class 타일채우기 {

    /**
     * 2*n 타일 채우기
     *
     * 1*2 또는 2*1 타일로 채우는 방법의 수를 구하는 프로그램 구하기
     * */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        int[] D = new int[num+1];

        D[1] = 1;
        D[2] = 2;

        for(int i=3; i<=num; i++){
                D[i] = D[i-1] + D[i-2];
        }


        System.out.println(D[num]);




    }
}
