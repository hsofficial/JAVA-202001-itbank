package ch11.interfaceex;

public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("order for buy");
	}
}
