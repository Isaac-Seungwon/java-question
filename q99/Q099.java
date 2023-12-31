package com.test.question.q99;

public class Q099 {

	public static void main(String[] args) {
		/*
		● 요구사항
		시간 클래스를 구현하시오.
		
		● 조건
		- 생성자 오버로딩을 구현하시오.
		- 2자리 출력
		- Time
			시간 클래스
			상태
				hour: 시(0 이상 양의 정수)
				minute: 분(0 이상 양의 정수)
				second: 초(0 이상 양의 정수)
			행동
				public Time()
					기본 생성자
					시(0), 분(0), 초(0)
				public Time(int hour, int minute, int second)
					생성자 오버로딩
					hour : 시
					minute : 분
					second : 초
				public Time(int minute, int second)
					생성자 오버로딩
					minute : 분
					second : 초
				public Time(int second)
					생성자 오버로딩
					second : 초
					String info()
					02:30:45
		
		● 호출
		//시간 1
		Time t1 = new Time(); //기본 생성자 호출
		System.out.println(t1.info());
		
		//시간 2
		Time t2 = new Time(2, 30, 45); //오버로딩 생성자 호출
		System.out.println(t2.info());
		
		//시간 3
		Time t3 = new Time(1, 70, 30); //오버로딩 생성자 호출
		System.out.println(t3.info());
		
		//시간 4
		Time t4 = new Time(30, 10); //오버로딩 생성자 호출
		System.out.println(t4.info());
		
		//시간 5
		Time t5 = new Time(90, 10); //오버로딩 생성자 호출
		System.out.println(t5.info());
		
		//시간 6
		Time t6 = new Time(50); //오버로딩 생성자 호출
		System.out.println(t6.info());
		
		//시간 7
		Time t7 = new Time(10000); //오버로딩 생성자 호출
		System.out.println(t7.info());
		
		● 출력
		00:00:00 //t1.info();
		02:30:45 //t2.info();
		02:10:30 //t3.info();
		00:30:10 //t4.info();
		01:30:10 //t5.info();
		00:00:50 //t6.info();
		02:46:40 //t7.info();
		*/
		
		//시간 1
		Time t1 = new Time(); //기본 생성자 호출
		System.out.println(t1.info());

		//시간 2
		Time t2 = new Time(2, 30, 45); //오버로딩 생성자 호출
		System.out.println(t2.info());

		//시간 3
		Time t3 = new Time(1, 70, 30); //오버로딩 생성자 호출
		System.out.println(t3.info());

		//시간 4
		Time t4 = new Time(30, 10); //오버로딩 생성자 호출
		System.out.println(t4.info());

		//시간 5
		Time t5 = new Time(90, 10); //오버로딩 생성자 호출
		System.out.println(t5.info());

		//시간 6
		Time t6 = new Time(50); //오버로딩 생성자 호출
		System.out.println(t6.info());

		//시간 7
		Time t7 = new Time(10000); //오버로딩 생성자 호출
		System.out.println(t7.info());
	}
}
