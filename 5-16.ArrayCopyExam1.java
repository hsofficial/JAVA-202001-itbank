package ch05;

public class ArrayCopyExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[ ] abc= { 'A', 'B', 'C', 'D' };
		char[ ] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		char[] dest= new char[10];
		
		System.out.println("==============01==============");
		for (char i : abc)
			System.out.print(i + " ");
		System.out.println();
		
		for (char i : num)
			System.out.print(i + " ");
		
		System.out.println("\n==============02==============");
		System.arraycopy(abc, 0, dest, 0, abc.length);
		System.arraycopy(num, 4, dest, abc.length, dest.length - abc.length);
		for (char i : dest)
			System.out.print(i + " ");
		
		System.out.println("\n==============03==============");
		System.arraycopy(abc, 0, dest, 6, 3);
		for (char i : dest)
			System.out.print(i + " ");
	}

}
