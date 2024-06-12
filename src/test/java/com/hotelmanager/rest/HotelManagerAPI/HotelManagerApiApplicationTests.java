package com.hotelmanager.rest.HotelManagerAPI;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.hotelmanager.rest.HotelManagerAPI.model.RoomBookingReqEntity;
import com.hotelmanager.rest.HotelManagerAPI.model.RoomBookingRespEntity;
import com.hotelmanager.rest.HotelManagerAPI.service.RoomBookingService;
import com.hotelmanager.rest.HotelManagerAPI.service.RoomBookingServiceImpl;

@SpringBootTest
class HotelManagerApiApplicationTests {

	private RoomBookingService roomBookingService;
	
	@BeforeEach
	void init() {
		roomBookingService = new RoomBookingServiceImpl();
	}
	@Test
	void contextLoads() {
		RoomBookingReqEntity roomBookingReq = new RoomBookingReqEntity();
		RoomBookingRespEntity roomBookingRespEntity;
		roomBookingReq.setGuestName("Mani");
		roomBookingReq.setNumOfGuest(5);
		roomBookingRespEntity = roomBookingService.roomBookingService(roomBookingReq);
		assertEquals("Success", roomBookingRespEntity.getBookingResponse());
	}

}
