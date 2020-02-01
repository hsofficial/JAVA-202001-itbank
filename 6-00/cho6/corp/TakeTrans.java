package cho6.corp;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("dlwlrma", 10000);
		Student student2 = new Student("leejieun", 5000);
		Student student3 = new Student("jieun", 3000);
		Student student4 = new Student("jigum", 50000);
		
		Bus bus1 = new Bus(1004);
		Subway line1 = new Subway("2È£¼±");
		Taxi taxi1 = new Taxi("93´õ 0516");
		
		student1.printInfo();
		student2.printInfo();
		bus1.printInfo();
		System.out.println();
		
		student1.takeBus(bus1);
		student1.printInfo();
		bus1.printInfo();
		System.out.println();
		
		student2.takeBus(bus1);
		student2.printInfo();
		bus1.printInfo();
		System.out.println();
		
		student3.takeSubway(line1);
		student3.printInfo();
		line1.printInfo();
		System.out.println();
		
		student4.takeTaxi(taxi1);
		student4.printInfo();
		taxi1.printInfo();
		
	}

}
