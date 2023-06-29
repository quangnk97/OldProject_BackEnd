package com.techshopbe.dto;

public class ShippingInfoDTO {
	private String fullname;
	private String phone;
	private String address;

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ShippingInfoDTO(String fullname, String phone, String address) {
		super();
		this.fullname = fullname;
		this.phone = phone;
		this.address = address;
	}

	public ShippingInfoDTO() {
	}
}
