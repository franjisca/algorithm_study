package com.example.algorithm.study;

public class 벨만포드 {


    /**
     * 그래프에서 최단 거리 구하는 알고리즘
     * 음수 가중치 엣지가 있어도 수행할 수 있음
     * 전체 그래프에서 음수 사이클의 존재 여부를 판단할 수 있음 ❗️
     * 시간복잡도: O(VE)
     *
     * 1. 엣지리스트로 그래프를 구현하고 최단 경로 리스트 초기화 하기
     * 2. 모든 엣지를 확인해 정답 리스트 업데이트 하기
     *    업데이트 반복 횟수: 노드 개수 -1
     * 3. 음수 사이클이 존재하는지 확인: 모든 에지를 한 번씩 다시 사용해 업데이트되는 노드가 발생하는지 확인
     *
     *
     * */
}
