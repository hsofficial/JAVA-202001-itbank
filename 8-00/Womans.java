package ch08;

public class Womans extends Human {
	private String job;
	
	public Womans(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}

	@Override
	public String toString() {
		return "Womans job=" + job + "name=" + getName() + "age = "+ getAge();
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	
	
}
