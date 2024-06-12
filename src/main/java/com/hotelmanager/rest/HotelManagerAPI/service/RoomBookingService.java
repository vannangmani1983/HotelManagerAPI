package com.hotelmanager.rest.HotelManagerAPI.service;

import com.hotelmanager.rest.HotelManagerAPI.model.GetAvailableRoomsEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.GetGuestBookingEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.RoomBookingReqEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.RoomBookingRespEntity;

public interface RoomBookingService {

	public RoomBookingRespEntity roomBookingService(RoomBookingReqEntity rmBkgRequest);
	public GetAvailableRoomsEntity getAvailableRooms();
	public GetGuestBookingEntity getGuestBooking();
}
