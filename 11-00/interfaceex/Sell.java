package ch11.interfaceex;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("order for sell");
	}
}
