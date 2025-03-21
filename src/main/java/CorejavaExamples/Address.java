package CorejavaExamples;

import java.io.Serializable;

public class Address implements Serializable  {
	  private static final long serialVersionUID = 1L;
	public String street;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address(String street) {
		super();
		this.street = street;
	}

}
