package ch08.inheritance.quiz.person;

class Man extends Person { 	// Person Ŭ���� ������� ������� �ڽ� Ŭ���� Man
	private String gender;	// ����

	// default ���� ���� : ���� ��Ű�� ������ ���� ����
	String getGender() {				// gender ������
		return gender;
	}

	void setGender(String gender) {		// gender ������
		this.gender = gender;
	}
}