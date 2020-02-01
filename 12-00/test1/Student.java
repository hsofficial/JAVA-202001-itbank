package ch12.test1;

public class Student {
	String name;
	int num;
	
	public Student() {
		this("none", 000000);
	}
	
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : "+name+" , num : "+num;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			
			if(this.num == std.num)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return num;
	}
	
	
}
