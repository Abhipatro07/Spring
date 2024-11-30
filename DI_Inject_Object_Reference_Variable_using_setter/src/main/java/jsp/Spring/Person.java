package jsp.Spring;

public class Person {
	private Mobile mobile;
	
	public void use() {
		System.out.println("Person is using Mobile");
		mobile.ring();
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
}
