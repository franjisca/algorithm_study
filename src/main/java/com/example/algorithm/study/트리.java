package com.example.algorithm.study;

public class 트리 {

    /**
     *
     * 노드와 엣지로 연결된 그래프의 특수한 형태
     * 순환 구조x, 1개의 루트 노드
     * 루트를 제외한 노드는 단 1개의 부모 노드
     * 부분 트리 역시 트리의 모든 특징을 따름
     *
     *
     * ❗️ 이진트리
     * : 각 노드의 자식 노드의 개수가 2 이하로 구성된 트리
     * : 편향 이진 트리, 포화 이진 트리, 완전 이진 트리
     *
     *  ----------------------------------------
     *
     * ❗️ 세그먼트 트리
     * : 주어진 데이터의 구간합과 데이터 업데이트를 빠르게 수행하기 위해
     * : 인덱스 트리라고 불림
     *
     * 1. 트리 초기화: 리프 노드의 개수(n) 이상 되도록 트리 배열 만들기 2^k*2 트리 배열 정의
     *
     * 2. 질의값 구하기
     *    : 세그먼트 트리의 리프 노드에 해당하는 인덱스로 변경 - index + 2^k-1
     *    : start_index % 2 == 1 -> 해당 노드 선택
     *    : end_index % 2 == 0 -> 해당 노드 선택
     *    : start_index depth 변경 -> end_index = (end_index -1) / 2
     *    : 위 내용들을 반복하다가 end_index < start_index 되면 종료
     *
     * 3. 데이터 업데이트 =>  index + 2^k-1 값 업데이트 해주기
     *
     *   ----------------------------------------
     *
     * ❗️️LCA (최소 공통 조상)
     * : 임의의 두 노드를 선택 했을 때 두 노드가
     *   각각 자신을 포함해 거슬러 올라가면서 부모 노드를 탐색할 때
     *   처음 공통으로 만나게 되는 부모 노드
     *
     * 1. 트리의 높이가 크지 않을 때, 루트 노드에서 탐색 시작해
     *    각 노드의 부모 노드와 깊이 저장 (dfs나 bfs 이용해 수행)
     * 2. 깊이가 같은 상태에서는 동시에 부모 노드로 올라가면서
     *    두 노드가 같은 노드가 될 때까지 반복, 이때 처음 만나는 노드가 최소 공통 조상이 됨
     *
     *    ----------------------------------------
     *
     * ❗️LCA (최소 공통 조상 빠르게 구하기)
     * : 2^k씩 올라가 비교하는 방법
     *
     * 1. 부모 노드 저장 배열 만들기 P[k][n] = n번 노드의 2^k번째 부모의 노드 번호
     *    부모 노드 배열 점화식 -> p[k][n] = p[k-1][p[k-1][n]]
     * 2. 선택된 두 노드의 깊이 맞추기
     *
     *
     * */
}
