package ch02.var;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		
		//int i= 123.456;
		//double 자료형을 int 변수에 대입
		
		float f = 123.456f;
		//접미사f흫 붙이면 double 자료형이 float 자료형이 됨
		double d = 123.456;
		//접미사 d를 생략하면 double 자료형으로 인식
		double dd = 123.45d;
		//double 자료형임을 명시
		
		char ch1 = 'A';
		//char은 한 문자만 담을수 있는 타입
		char ch3 = '다';
		//2바이트 자료형 크기 한글 가능
		String str= "ABC def";
		//문자열 객체, 여러개의 문자 생성
		//참조형 변수
		
		String str1 = new String("dlwlrma");
		
		final int MAX = 100;
		//final 키워드 사용시 상수가됨
		
		//MAX = 200
		// 오류(상수의값은변경안됨)
		
		char a = '\u0041';
		//16진수 유니코드, 이스케이프 문자
		
		System.out.println(x +'\t' + f);
		System.out.println(f + '\n');
		System.out.println('\\');
		System.out.println('\'');
		System.out.println('\"');
		System.out.println(d);
		System.out.println(dd);
		System.out.println(ch1);
		System.out.println(ch3);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(a);
	}

}
