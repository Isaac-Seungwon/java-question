package com.test.question;

import java.util.Arrays;

public class Q066 {
	public static void main(String[] args) {
		/*
		● 요구사항
		중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		
		● 조건
		- 숫자의 범위: 1 ~ 45
		- 오름차순 정렬
		
		● 출력
		[1, 5, 23, 36, 37, 41]
		*/
		
		int[] lotto = new int [6]; // 랜덤 6개
		boolean loop = true; // 중복 검사
		
		
		// 로또 번호 생성 루프
		while (loop) {
			// 난수 6개 생성
			for (int i = 0; i < 6; i++) {
				lotto[i] = (int)(Math.random() * 45) + 1;
			}
			
			// 로또 번호 중복 검사
			loop = false;
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (i != j && lotto[i] == lotto[j]){
						// 자기 자신을 제외한 숫자와 비교해서 같을 경우 루프
						loop = true;
					}
				}
			}
		}
		
		// 로또 번호 정렬 (오름차순)
		Arrays.sort(lotto);

		// 로또 번호 출력
		System.out.printf("%s\n", dump(lotto));
	}
	
	public static String dump(int[] list) {
		return Arrays.toString(list);
	}
}
