package com.example.algorithm.study;

public class 그래프의표현 {

    /**
     * 아주 중요함!
     *
     * 1. 엣지리스트: 엣지를 중심으로 그래프 표현
     *    가중치가 없는 그래프: A[2][N] - S E
     *    가중치가 있는 그래프: A[3][N] - S E V
     *
     *
     * 2. 인접행렬: 2차원 배열을 자료구조로 이용하여 그래프 표현
     *    가중치 없는 그래프: A[N][N]
     *    가중치 있는 그래프: A[N][N] = V값 넣어주기
     *    시간복잡도가 높음, 공간효율성 떨어짐, 노드 개수가 많으면 2차원 배열 선언 자체를 할 수 없음
     *    노드가 적을 때 사용!
     *
     *
     * 3. 인접리스트: ArrayList, 노드 개수만큼 선언, 가장 많이 사용
     *    가중치 없는 그래프: ArrayList<Integer>[5], 가중치 x
     *    가중치 있는 그래프: ArrayList<Node>[N]
     *    그래프 구현은 복잡하지만 노드와 연결되어 있는 엣지를 탐색하는 시간은 매우 뛰어남
     *
     * */
}
