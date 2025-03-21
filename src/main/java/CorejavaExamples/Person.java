package CorejavaExamples;

import java.io.Serializable;

public class Person implements Serializable {
	
	  private static final long serialVersionUID = 1L;
	public String name;
	public Address address;

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
