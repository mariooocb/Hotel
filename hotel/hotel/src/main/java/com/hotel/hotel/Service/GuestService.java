package com.hotel.hotel.Service;

import com.hotel.hotel.Dto.GuestDto;
import com.hotel.hotel.Model.GuestEntity;
import com.hotel.hotel.Repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public void createGuest(GuestDto guestDto) {
        GuestEntity guestEntity = new GuestEntity();
        guestEntity.setName(guestDto.getName());
        guestEntity.setLastName(guestDto.getLastName());
        guestEntity.setDateOfBirth(guestDto.getDateOfBirth());
        guestEntity.setNationality(guestDto.getNationality());
        guestEntity.setPhone(guestDto.getPhone());
        guestRepository.save(guestEntity);
    }
}
