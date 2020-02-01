package ch11.interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("sell");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("buy");

	}

	@Override
	public void order() {
		System.out.println("customer order for transation");
	}

}
