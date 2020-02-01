package ch12.object;

public class StringConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("str1");
		String str2 = new String("str2");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		str1 = str1.concat(str2);
		System.out.println(str1);
	}

}
