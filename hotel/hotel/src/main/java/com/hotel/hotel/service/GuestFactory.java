package com.hotel.hotel.service;

import com.hotel.hotel.dto.GuestRequest;
import com.hotel.hotel.model.GuestEntity;
import org.springframework.stereotype.Component;

@Component
public class GuestFactory {
    public void createGuest(GuestRequest guestRequest) {
        GuestEntity guestEntity = new GuestEntity();
        guestEntity.setName(guestRequest.getName());
        guestEntity.setLastName(guestRequest.getLastName());
        guestEntity.setDateOfBirth(guestRequest.getDateOfBirth());
        guestEntity.setNationality(guestRequest.getNationality());
        guestEntity.setPhone(guestRequest.getPhone());
    }
}
