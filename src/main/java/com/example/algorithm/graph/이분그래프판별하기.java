package com.example.algorithm.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 이분그래프판별하기 {

        /**
         * 이분 그래프: 각 집합에 속한 노드끼리 서로 인접하지 않는 두 집합으로 그래프의 노드를 나눌 수 있을 때
         * */

    static ArrayList<Integer>[] A;
    static int[] check;

    static boolean[] visited;

    static boolean isEven;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int testCase =  Integer.parseInt(br.readLine());

        for(int i=0; i< testCase; i++){

            // node - edge

            String[] s = br.readLine().split(" ");
            int v = Integer.parseInt(s[0]);
            int e = Integer.parseInt(s[0]);

            A = new ArrayList[v+1];

            visited = new boolean[v+1];

            check = new int[v+1];

            isEven = true;

            for(int j=1; j<=v; j++){
                A[i] =  new ArrayList<Integer>();

            }

            // 엣지데이터 저장

            for(int k=0; k<e; k++){
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                A[start].add(end);
                A[end].add(start);
            }

            // 모든 노드에서 dfs 실행
            for(int k=1; k<=v; k++){

                if(isEven)DFS(1);
                else break;
            }

            if(isEven) System.out.println("YES");
            else System.out.println("No");


        }




    }

    private static void DFS(int node) {
        visited[node] = true;

        for(int i: A[node]){

            if(!visited[i]) {
                // 바로 직전에 있는 노드와 다른 집합으로 분류를 해주는 것 필요
                check[i] = (check[node] + 1) % 2;
                DFS(i);
            } else if (check[node] == check[i]) {
                    isEven = false;
            }

        }

    }
}
