package ch06.reference.test3;

public class MallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall order1 = new Mall();
		
		order1.ordernum = 201803120001L;
		order1.id = "abc123";
		order1.date = "2018-03-12";
		order1.name = "jieun";
		order1.lot = "PD0345 - 12";
		order1.address = "서울시 영등포구 여의도동 20번지";
		
		order1.info();
		
		Mall order2 = new Mall("qwerty");
		
		order2.ordernum = 201803120002L;
		order2.date = "2018-03-12";
		order2.name = "leejieun";
		order2.lot = "PD0345 - 12";
		order2.address = "서울시 영등포구 여의도동 21번지";
		
		order2.info();
		
	}

}
