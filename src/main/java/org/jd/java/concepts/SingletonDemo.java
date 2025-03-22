package org.jd.java.concepts;

public class SingletonDemo {

	private static SingletonDemo INSTANCE = null;
	
	private SingletonDemo() {
	}

	public static SingletonDemo getInstance() {
		if ( INSTANCE == null ) {
			INSTANCE = new SingletonDemo();
		}
		return INSTANCE;
	}
}
