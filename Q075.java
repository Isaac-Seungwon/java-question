package com.test.question;

public class Q075 {
	public static void main(String[] args) {
		/*
		● 요구사항
		아래와 같이 출력하시오.
		
		● 출력
		1	2	3	4	10
		5	6	7	8	26
		9	10	11	12	42
		13	14	15	16	58
		28	32	36	40	136
		*/
		
		int[][] nums = new int[5][5];

		// 데이터 입력 > 문제
		int n = 1;
		int sum = 0;
		
		for (int i=0; i<nums.length; i++) {
			sum = 0;
			for (int j=0; j<nums.length - 1; j++) {
				nums[i][j] = n;
				n++;
				sum += nums[i][j];
			}
			nums[i][nums.length - 1] = sum;

			// i가 마지막일 때 아래로 더함
			if (i == nums.length - 1) {
				for (int k=0; k <nums.length; k++) {
					sum = 0;
					for (int j=0; j<nums.length - 1; j++) {
						sum += nums[j][k];
					}
					nums[i][k] = sum;
				}
			}
		}

		// 출력 > 수정 없이 그대로 사용
		for (int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
