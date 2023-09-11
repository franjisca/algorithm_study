package com.example.algorithm.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색_self {

    // 1은 이동 가능, 0은 이동 불가능
    // 서로 인접한 칸으로만 이동
    // 이동한 칸을 셀 때는 시작 위치와 도착 위치를 포함
    // n * m 미로가 주어질 때 (1, 1)에서 출발해 n,m의 위치로 이동하기 위해 지나쳐야 하는 칸의 수 최솟값을 구하기

    // ----
    // 데이터의 크기가 100개로 매우 작기 때문에 시간 제한은 별도로 생각하지 않아도 됨


    private static int[] dx = {0, 1, 0, -1};

    private static int[] dy = {1, 0, -1, 0};


    private int n;

    private int m;

    private int[][] arr;

    private boolean[][] visited;

    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }

    public 미로탐색_self(int n, int m) {
        this.n = n;
        this.m = m;
        arr = new int[n][m];
        visited = new boolean[n][m];
    }

    public void saveArr(BufferedReader br, StringTokenizer st) throws IOException {

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
    }

    private void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[] {i, j});
        visited[i][j] = true;
        while(!queue.isEmpty()) {

            int now[] = queue.poll();

            for(int k=0; k<4; k++){
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if(x >=0 && y >= 0 && x < n && y < m) {

                    if(arr[x][y] != 0 && visited[x][y]) {

                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]] + 1; // 핵심
                        queue.add(new int[] {x, y});
                    }
                }
            }
        }
    }

    public void calcMin(){
        System.out.println(arr[n-1][m-1]);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = 0;
        int M = 0;

        for(int i=0; i<2; i++){
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }


        미로탐색_self tryData = new 미로탐색_self(N, M);


        synchronized (tryData) {
            tryData.saveArr(br, st);
            tryData.BFS(0,0);
            tryData.calcMin();

        }

    }


}
