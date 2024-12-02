package jsp.Spring;

import java.util.Map;

public class Store {
	private int id;
	private String sname;
	private Map<Integer , String> items;
	
	
	public Store(int id, String sname, Map<Integer, String> items) {
		super();
		this.id = id;
		this.sname = sname;
		this.items = items;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(sname);
		System.out.println(items);
	}
}
