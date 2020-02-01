package ch13.exception;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("resources are closed[close()]");

	}

}
