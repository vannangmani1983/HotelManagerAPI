package com.hotelmanager.rest.HotelManagerAPI.model;

import java.util.Date;

public class RoomBookingReqEntity {

	private String guestName;
	
	private int  numOfGuest;
	
	private String reqDate;
	

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public int getNumOfGuest() {
		return numOfGuest;
	}

	public void setNumOfGuest(int numOfGuest) {
		this.numOfGuest = numOfGuest;
	}

	public String getReqDate() {
		return reqDate;
	}

	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

}
