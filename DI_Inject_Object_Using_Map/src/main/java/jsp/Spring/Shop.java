package jsp.Spring;

import java.util.Map;

public class Shop {
	private int sid;
	private String sname;
	private String location;
	private Map<Integer , String> items;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Map<Integer, String> getItems() {
		return items;
	}
	public void setItems(Map<Integer, String> items) {
		this.items = items;
	}

}
