package com.hotelmanager.rest.HotelManagerAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelmanager.rest.HotelManagerAPI.model.GetAvailableRoomsEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.GetGuestBookingEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.RoomBookingReqEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.RoomBookingRespEntity;
import com.hotelmanager.rest.HotelManagerAPI.service.RoomBookingService;

@RestController
public class HotelManagerAPIController {

	@Autowired
	private RoomBookingService roomBooking;
	
	@PostMapping(value = "/roombooking")
	public ResponseEntity<RoomBookingRespEntity> roomBookingService( @RequestBody RoomBookingReqEntity rmBkgEnty){
		RoomBookingRespEntity rmBkgRespEntity = new RoomBookingRespEntity();
		try {
			rmBkgRespEntity = roomBooking.roomBookingService(rmBkgEnty);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(rmBkgRespEntity);
	}
	
	@GetMapping(value = "/getavailablerooms")
	public ResponseEntity<GetAvailableRoomsEntity> getAvailableRooms( ){
		GetAvailableRoomsEntity getAvblrooms = new GetAvailableRoomsEntity();
		try {
			getAvblrooms = roomBooking.getAvailableRooms();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(getAvblrooms);
	}
	
	@GetMapping(value = "/getguestbookings")
	public ResponseEntity<GetGuestBookingEntity> getGuestBookings( ){
		GetGuestBookingEntity getBookings =  new GetGuestBookingEntity();
		try {
			getBookings = roomBooking.getGuestBooking();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(getBookings);
	}
}
