package ch12.object;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder buffer = new StringBuilder("java");
		
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		System.out.println();
		
		buffer.append(" and");
		buffer.append(" android");
		
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		System.out.println();
		
		String str = buffer.toString();
		System.out.println(str);
		System.out.println(System.identityHashCode(str));

	}

}
