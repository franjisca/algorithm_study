package com.example.algorithm.binary;

import java.util.Arrays;
import java.util.Scanner;

public class 이진탐색_강의코드 {
    // 원하는 정수 찾기 문제
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = Integer.parseInt(sc.nextLine());
        int arr[] = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(sc.nextLine());

        for(int j=0; j<M; j++){
            boolean find = false;

            int target = Integer.parseInt(sc.nextLine());

            int start = 0;
            int end = arr.length-1;

            while (start <= end) {
                int mid_index = (start + end) / 2;
                int mid_value = arr[mid_index];

                if(mid_value > target){
                    end = mid_index -1;
                }else if(target < mid_value) {
                    end = mid_index + 1;
                } else {
                    find = true;
                    break;
                }
            }

            if(find) System.out.println(1);
            else System.out.println(0);
        }


     //   for(int i=0; i<arr.length; i++){

     //   }

    }
}
