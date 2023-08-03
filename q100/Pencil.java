package com.test.question.q100;

class Pencil {
	private String hardness;
	
	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}
	
	public String info() {
		return String.format("%s 진하기 연필", this.hardness);
	}
}
