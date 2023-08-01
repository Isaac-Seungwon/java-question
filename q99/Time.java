package com.test.question.q99;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this(0, 0, 0);
	}
	
	public Time(int hour, int minute, int second) {
		this.second = second % 60;
		this.hour = (second / 60 + minute) / 60;
		this.minute = (second / 60 + minute) % 60;
		this.hour += hour;
	}

	public Time(int minute, int second) {
		this(0, minute, second);
	}
	
	public Time(int second) {
		this(0, 0, second);
	}
	
	String info() {
		/*
		if (this.second >= 60) {
			this.minute += this.second / 60;
			this.second -= (this.second / 60) * 60;
		}
		
		if (this.minute >= 60) {
			this.hour += this.minute / 60;
			this.minute -= (this.minute / 60) * 60;
		}
		*/
		
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
	}
}
