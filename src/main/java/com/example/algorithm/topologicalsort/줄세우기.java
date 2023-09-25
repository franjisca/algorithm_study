package com.example.algorithm.topologicalsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 줄세우기 {

    public static void main(String[] args) throws IOException {

        /**
         *
         * n 명의 학생들을 키 순서대로 세우려고 함, 두 학생의 키를 비교하는 방법 사용
         * 일부 학생들의 키 비교
         * 첫 째줄에  n과 m이 주어짐
         * A B : A 학생이 B학생 앞에 서야 함
         * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int[] nArr = new int[a+1];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<nArr.length; i++){
            list.add(new ArrayList<>());
        }


        int count = Integer.parseInt(arr[1]);

        for(int i=0; i<count; i++) {
            String[] tempArr = br.readLine().split(" ");
            int tempA = Integer.parseInt(tempArr[0]);
            int tempB = Integer.parseInt(tempArr[1]);
            list.get(tempA).add(tempB);
            nArr[tempB]++;

        }

        // 위상 정렬

            Queue<Integer> queue = new LinkedList<>();

            for(int i = 1; i<=a; i++){
                if(nArr[i] == 0){
                    queue.offer(i);
                }
            }

            while(!queue.isEmpty()){
                int now = queue.poll();
                System.out.println(now + " ");
                for(int next: list.get(now)){
                    nArr[next]--;
                    if(nArr[next] == 0){
                        queue.offer(next);
                    }
                }
            }
    }
}
