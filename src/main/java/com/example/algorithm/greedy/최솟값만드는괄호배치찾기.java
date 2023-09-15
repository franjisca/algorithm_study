package com.example.algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최솟값만드는괄호배치찾기 {


    /**
     *  세준이는 양수와 +,- 그리고 괄호를 이용해 어떤 수식 만들었음
     *  다시 괄호를 적절히 넣어 이 수식의 값을 최소로 만들려고 함
     *  괄호를 적절히 배치해 수식의 값을 최소로 만드는 프로그램 만들기
     *  식은 0-9, +, -만, 가장 처음과 마지막 문자는 숫자, 5자리보다 연속되는 숫자는 없음
     *  수는 0으로 시작할 수 있음, 입력으로 주어지는 식의 길이는 50보다 작거나 같음
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String data = br.readLine();

        String[] arr = data.split("-");


        int answer = 0;

        for(int i=0; i<arr.length; i++){
/*            if(i==0){
                answer += mySum(arr[i]);
            }
            answer -= mySum(arr[i]);*/

            answer = i == 0 ? answer + mySum(arr[i]) : answer - mySum(arr[i]);
        }

        System.out.println(answer);


    }

    private static int mySum(String data) {
        String[] numArr = data.split("\\+");
        int sum = 0;

        for(int i=0; i<numArr.length; i++){
            sum += Integer.parseInt(numArr[i]);
        }

        return sum;
    }
}
