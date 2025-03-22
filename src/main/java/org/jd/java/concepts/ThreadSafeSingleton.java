package org.jd.java.concepts;

public class ThreadSafeSingleton {

	public static volatile ThreadSafeSingleton INSTANCE = null;

	private ThreadSafeSingleton() {

	}

	// double check locking
	public static ThreadSafeSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new ThreadSafeSingleton();
				}
			}
		}
		return INSTANCE;
	}
}
