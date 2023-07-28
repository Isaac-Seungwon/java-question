package com.test.question;

public class Q085 {
	public static void main(String[] args) {
		/*
		● 요구사항
		주민 등록 번호 유효성 검사를 하시오.
		
		● 조건
		- '-'의 입력 유무 상관없이 검사하시오.
		
		● 입력 1
		주민등록번호: 951220-1021547 
		
		● 출력 1
		올바른 주민등록번호입니다.
		
		● 입력 2
		주민등록번호: 951220-1234567 
		
		● 출력 2
		올바르지 않은 주민등록번호입니다.
		*/
		
		// *** 면접 때 잘 나오는 문제
		// 주민등록번호 유효성 > 주민등록번호 생성하는 방법
		// 규칙에 따라 만들어진 번호인지를 확인
		// 7 0 0 1 0 1 - 1 0 1 0 1 0 4
		// 7 0: 00 ~ 99
		//     0 1: 1~31
		// 1, 2: 남 여 (1900년대생), 3, 4 2-00     
		
		String jumin = "951220-1021547";
		int pass = 0;
		int digit;
		
		// 출생년도 검사 (1 ~ 100)
		digit = Integer.parseInt(jumin.substring(0, 2));
		if (digit > 0 && digit < 100) {
			pass = 1;
		}
		
		// 출생 월 검사 (1 ~ 12)
		digit = Integer.parseInt(jumin.substring(2, 4));
		if (digit > 0 && digit < 13) {
			pass = 1;
		}
		
		// 성별 검사 (1 ~ 4)
		digit = Integer.parseInt(jumin.substring(7, 8));
		if (digit > -1 && digit < 5) {
			pass = 1;
		}
		
	}
	
	
}
