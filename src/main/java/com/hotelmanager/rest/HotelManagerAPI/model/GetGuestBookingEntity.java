package com.hotelmanager.rest.HotelManagerAPI.model;

import java.util.List;

public class GetGuestBookingEntity {

	private List<RoomBookingReqEntity> lstRoomBooking;

	public List<RoomBookingReqEntity> getLstRoomBooking() {
		return lstRoomBooking;
	}

	public void setLstRoomBooking(List<RoomBookingReqEntity> lstRoomBooking) {
		this.lstRoomBooking = lstRoomBooking;
	}
}
