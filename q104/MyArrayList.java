package com.test.question.q104;

class MyArrayList {

	// ArrayList<String>
	private String[] list;
	private int index;

	// 생성자
	public MyArrayList() {
		this.list = new String[4]; // ***
		this.index = 0;
	}

	public boolean add(String value) {
		
		try {
			// 배열의 방이 남아있는지 검증
			if (this.index == this.list.length) {
				// 배열의 크기를 2배 증감
				String[] temp = new String[this.list.length * 2];
				
				for (int i = 0; i < this.list.length; i++) {
					temp[i] = this.list[i];
				}
				
				this.list = temp;
			} else {
				if (this.list == null) {
					this.list = new String[4];
				}
			}
			
			this.list[this.index] = value;
			this.index++;

			return true;
		} catch (Exception e) {

			return false;
		}
	}

	public String get(int index) {

		if (index >= 0 && index < this.index) {
			return this.list[index];
		} else {
			return "";
		}
	}

	public int size() {
		return this.index;
	}

	public String set(int index, String value) {
		
		String temp = this.list[index]; // 기존 값 가져오기
		this.list[index] = value; // 새 값으로 변경

		return temp;
	}

	public String remove(int index) {
		
		String temp = this.list[index];

		for (int i = index; i < this.index - 1; i++) {
			this.list[i] = this.list[i + 1];
		}
		this.index--;

		return temp;
	}

	public boolean add(int index, String value) {
	    try {
	        // 배열이 꽉 찼을 경우 배열 크기 2배 확장
	        if (this.index == this.list.length) {
	            String[] temp = new String[this.list.length * 2];

	            for (int i = 0; i < this.list.length; i++) {
	                temp[i] = this.list[i];
	            }

	            this.list = temp;
	        }

	        // 지정된 위치에 요소를 추가하고, 뒤의 요소들을 한 칸씩 뒤로 이동
	        for (int i = this.index; i > index ; i--) {
	            this.list[i] = this.list[i - 1];
	        }
	        this.list[index] = value;
	        this.index++;

	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}


	public int indexOf(String value) {
		
		for (int i = 0; i < this.index; i++) {
			if (this.list[i].equals(value)) {
				return 1; // 발견
			}
		}

		return -1;
	}

	public int lastIndexOf(String value) {

		for(int i=0; i<this.index; i++) {
	        if (this.list[i].equals(value)) {
	            return i; // 발견된 위치
	        }
	    }
		
		return -1;
	}

	void clear() {
		/*
		for(int i = 0; i<this.index; i++) {
			this.list[i] = "";
		}
		*/
		this.index = 0;
	}
}
