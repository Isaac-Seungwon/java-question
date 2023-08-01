package com.test.question.q95;

import com.test.java.obj.Person;

class Employee {
	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	// getter, setter 구현

	public void info() {
		// 직원 정보 확인
		String txt = "[";
		
		txt += this.name + "]\n"
			+ "부서: " + this.department + "\n"
			+ "직위: " + this.position + "\n"
			+ "연락처: " + this.tel + "\n"
			+ "직속상사: " + (this.boss == null ?
					"없음" : (this.boss.getName() + "(" + this.boss.getDepartment() + " " + this.boss.getPosition() + ")"))
			+ "\n";
		
		System.out.println(txt);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// 한글 2~5자 이내
		if (name.length() >= 2 && name.length() <= 5 && name.matches("[가-힣]*")) {
            this.name = name;
        }
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		// 영업부, 기획부, 총무부, 개발부, 홍보부
		String[] departmentList = {"영업부", "기획부", "총무부", "개발부", "홍보부"};
		for (String c : departmentList) {
            if (department.equals(c)) {
            	this.department = department;
            }
        }
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		// 부장, 과장, 대리, 사원
		String[] positionList = {"부장", "과장", "대리", "사원"};
		for (String c : positionList) {
            if (position.equals(c)) {
            	this.position = position;
            }
        }
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		// 010-XXXX-XXXX 형식 확인
		if (tel.length() != 13) {
			return;
		}

		for (int i = 0; i < 13; i++) {
			char c = tel.charAt(i);
			if (i == 3 || i == 8) {
				if (c != '-') {
					return;
				}
			} else {
				if (c < '0' || c > '9') {
					return;
				}
			}
		}

		this.tel = tel;
	}

	public Employee getBoss() {
		
		return boss;
	}

	public void setBoss(Employee boss) {
		
		if (boss == null) {
			return;
		}
		if (this.name.equals(boss.getName()) && this.department.equals(boss.getDepartment()) && this.position.equals(boss.getPosition()) && this.tel.equals(boss.getTel())) {
			return;
		}
		if (!this.department.equals(boss.getDepartment())) {
			return;
		}
		this.boss = boss;
	}
}