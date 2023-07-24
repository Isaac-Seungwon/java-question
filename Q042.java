package com.test.question;

import java.util.Date;
import java.util.Scanner;

public class Q042 {
	public static void main(String[] args) {
		/*
		● 요구사항
		서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
		
		● 조건
		- Calendar 클래스 사용 금지

		● 윤년, 평년 조건
		a. 년도를 4로 나눈다.
			떨어지면 b 검사
			떨어지지 않으면 "평년"
		b. 년도를 100으로 나눈다.
			떨어지면 c 검사
			떨어지지 않으면 "윤년"
		c. 년도를 400으로 나눈다.
			떨어지면 "윤년"
			떨어지지 않으면 "평년"
		
		● 출력
		2023년 7월 24일은 738,725일째 되는 날이고 월요일입니다.
		*/

		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for (int year = 1; year <= 2022; year++) {
				
			if (year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						// 윤년
						sum = sum + 366;
					}
					else {
						// 평년
						sum = sum + 365;
					}
				}
				else {
					// 윤년
					sum = sum + 366;
				}
			}
			else {
				// 평년
				sum = sum + 365;
			}
		}
		
		System.out.printf("2023년 7월 24일은 %,d일째 되는 날이고 월요일입니다.", sum);
	}
}
