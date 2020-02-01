package ch02.var;

public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = Byte.MAX_VALUE;
		byte b = Byte.MIN_VALUE;
		
		//a = a + 1;
		// 컴파일오류(오버플로우) > int
		//b = b - 1;
		// 컴파일오류(언더플로우) > int
		
		byte c = (byte)(a + 1);
		//강제형변환
		System.out.println("오버플로우발생후a의값: "+ c);
		
		short aa = (short) (a + 1);
		System.out.println("normal calculation value : "+ aa);
		
		byte d = (byte)(b - 1);
		System.out.println("언더플로우발생후b의값: "+ d);
		
		short bb = (short) (b - 1);
		System.out.println("normal calculation value : "+ bb);
		
		//자료형의 크기 최솟값 최대값 확인
		System.out.println(Byte.SIZE + "Bit");
		System.out.println(Byte.BYTES + "Bytes");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
	}

}
