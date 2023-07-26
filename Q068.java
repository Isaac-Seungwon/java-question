package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
	public static void main(String[] args) {
		/*
		● 요구사항
		배열의 요소를 삭제하시오.
		
		● 조건
		- 배열 길이: 10
		- 마지막 요소는 0으로 채우시오.
		
		● 입력 1
		삭제 위치: 2 
		
		● 출력 1
		원본: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
		결과: [5, 6, 3, 2, 0, 0, 0, 0, 0, 0]
		
		● 입력 2
		삽입 위치: 5 
		
		● 출력 2
		원본: [5, 6, 1, 3, 2, 8, 7, 4, 10, 9]
		결과: [5, 6, 1, 3, 2, 7, 4, 10, 9, 0]
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] list = new int [10];
		int[] copy;
		int temp;
		int erase; // 삭제 위치
		
		// 배열 값 생성
		for (int i = 0; i < 10; i++) {
			list[i] = (int)(Math.random() * 10) + 0;
		}
		
		// 원본 배열 copy
		copy = Arrays.copyOfRange(list, 0, list.length);
		
		
		// 삽입 위치 입력
		System.out.printf("삭제 위치: ");
		erase = scan.nextInt();

		
		// 삭제할 위치까지 앞으로 옮김
		for (int i = erase; i < 9; i++) {
			list[i] = list[i + 1];
		}
		
		// 리스트의 마지막 값에 0 삽입
		list[9] = 0;
		
		
		// 출력
		System.out.printf("원본: %s\n", Arrays.toString(copy));
		System.out.printf("결과: %s\n", Arrays.toString(list));
	}
}
