package ch08.inheritance.quiz.person;

public class InheritanceTest {
	public static void main(String[] args) {
		Man m = new Man();
		// ������ �޼��带 �̿��Ͽ� ��ü�� �ν��Ͻ� ���� ����
		m.setNo(871023);
		m.setAge(27);
		m.setGender("M");
		
		// ������(��ȯ��) �޼��带 ��� �޼����� �μ��� ȣ���Ͽ� ����� Ȯ��
//		System.out.println("������ �Ϸù�ȣ : " + m.getNo());
//		System.out.println("������ ���� : " + m.getAge());
		m.print();// �θ��� �޼��� ȣ��
		System.out.println(m.getClass().getSimpleName() + " ���� : " + m.getGender());
		
		Woman w = new Woman();
		w.setNo(891225);
		w.setAge(29);
		w.setHeight(165);
		w.print();
		System.out.println(w.getClass().getSimpleName() + " Ű : " + w.getHeight());
		/*System.out.println("\n������ �Ϸù�ȣ : " + w.getNo()		// ������ �Ϸù�ȣ
							+ "\n������ ���� : " + w.getAge()		// ������ ����
							+ "\n������ Ű : " + w.getHeight());	// ������ Ű*/
	}
}


