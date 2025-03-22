package org.jd.java.concepts;

//As per Joshua Bloch, this single element enum is the best way to create a Singleton.
public enum SingletonEnum {
	
	INSTANCE;
	
	private SingletonEnum() {
		System.out.println("Singleton ENUM invoked.");
	}
	
}
