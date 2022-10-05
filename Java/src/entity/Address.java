package entity;

import com.sun.istack.internal.NotNull;

public class Address {

	
	private String mainRoad;
	@NotNull
	private String city;

	private Integer pinCode;

	public Address(String mainRoad, String city, Integer pinCode) {
		super();
		this.mainRoad = mainRoad;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getMainRoad() {
		return mainRoad;
	}

	public void setMainRoad(String mainRoad) {
		this.mainRoad = mainRoad;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	
	@Override
	public String toString() {
		return "Address [mainRoad=" + mainRoad + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
}
