package ch02.var;

public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = Byte.MAX_VALUE;
		byte b = Byte.MIN_VALUE;
		
		//a = a + 1;
		// �����Ͽ���(�����÷ο�) > int
		//b = b - 1;
		// �����Ͽ���(����÷ο�) > int
		
		byte c = (byte)(a + 1);
		//��������ȯ
		System.out.println("�����÷ο�߻���a�ǰ�: "+ c);
		
		short aa = (short) (a + 1);
		System.out.println("normal calculation value : "+ aa);
		
		byte d = (byte)(b - 1);
		System.out.println("����÷ο�߻���b�ǰ�: "+ d);
		
		short bb = (short) (b - 1);
		System.out.println("normal calculation value : "+ bb);
		
		//�ڷ����� ũ�� �ּڰ� �ִ밪 Ȯ��
		System.out.println(Byte.SIZE + "Bit");
		System.out.println(Byte.BYTES + "Bytes");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
	}

}
