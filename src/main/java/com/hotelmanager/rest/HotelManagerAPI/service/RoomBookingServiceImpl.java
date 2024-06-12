package com.hotelmanager.rest.HotelManagerAPI.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hotelmanager.rest.HotelManagerAPI.model.GetAvailableRoomsEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.GetGuestBookingEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.RoomBookingReqEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.RoomBookingRespEntity;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Service
public class RoomBookingServiceImpl implements RoomBookingService{

	@Value("${rooms.total.available}") 
	 private String strAvblrooms;
	@Override
	public RoomBookingRespEntity roomBookingService(RoomBookingReqEntity rmBkgRequest) {
		RoomBookingRespEntity rmBkgResp = new RoomBookingRespEntity();
		List<RoomBookingReqEntity> lstRoomBooking = new ArrayList<>();
		RoomBookingReqEntity roomBooking = new RoomBookingReqEntity();
		int intAvblrooms = Integer.parseInt(strAvblrooms);
		if(intAvblrooms > 0) {
			roomBooking.setGuestName(rmBkgRequest.getGuestName());
			roomBooking.setNumOfGuest(rmBkgRequest.getNumOfGuest());
			roomBooking.setReqDate(rmBkgRequest.getReqDate());
			lstRoomBooking.add(roomBooking);
			rmBkgResp.setBookingResponse("Room Successfully Booked");
		}else {
			rmBkgResp.setBookingResponse("Rooms Not Available");
		}		
		return rmBkgResp;
	}

	@Override
	public GetAvailableRoomsEntity getAvailableRooms() {
		GetAvailableRoomsEntity getAvblRooms = new GetAvailableRoomsEntity();
		getAvblRooms.setAvailableRooms(strAvblrooms);
		return getAvblRooms;
	}

	@Override
	public GetGuestBookingEntity getGuestBooking() {
		List<RoomBookingReqEntity> lstGetBookings = new ArrayList<>();
		RoomBookingReqEntity roomBooking = new RoomBookingReqEntity();
		GetGuestBookingEntity getGuestBooking = new GetGuestBookingEntity();
		try {
			roomBooking.setGuestName("Mani");
			roomBooking.setNumOfGuest(5);
			roomBooking.setReqDate("2024-06-07");
			lstGetBookings.add(roomBooking);
			getGuestBooking.setLstRoomBooking(lstGetBookings);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getGuestBooking;
	}
	

}
