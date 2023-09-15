package org.jd.multiple.choice.questions;

//Link: https://www.javatpoint.com/java-mcq
public class WhatIsTheOutputQuestion1 {

	public static void main(String[] args) {
		WhatIsTheOutputQuestion1 obj = new WhatIsTheOutputQuestion1(n);
		
		//float a = 35/0;
		int x=3, y=5, z=10;
		a = ++z + y - y + z + x++;
		System.out.println("a = "+ (++z + y - y + z + x++));
		System.out.println("a = "+ a);
	}

	static int a = 10;
	static int n;
	int b = 5;
	int c;

	public WhatIsTheOutputQuestion1(int m) {
		System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);
		
	}

	// Instance Block
	{
		b = 30;
		n = 20;
	}
	// Static Block
	static {
		a = 60;
	}
}
