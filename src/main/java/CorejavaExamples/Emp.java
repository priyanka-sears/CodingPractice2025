package CorejavaExamples;

import java.io.Serializable;

public class Emp implements Serializable {
	private static final long serialversionUID = 129348938L;
	transient int a;
	static int b;
	String name;
	int age;

// Default constructor
	public Emp(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}

}