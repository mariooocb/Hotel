package com.hotel.hotel.service;


import com.hotel.hotel.dto.GuestRequest;
import com.hotel.hotel.model.GuestEntity;
import com.hotel.hotel.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;
    @Autowired
    private GuestFactory guestFactory;
    public void createGuest(GuestRequest guestRequest) {

    }
}