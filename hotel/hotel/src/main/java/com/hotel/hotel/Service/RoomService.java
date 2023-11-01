package com.hotel.hotel.Service;

import com.hotel.hotel.Dto.RoomDto;
import com.hotel.hotel.Model.RoomEntity;
import com.hotel.hotel.Repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private RoomRepository roomRepository;



    public void createRoom(RoomDto roomDto){
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setIdRoom(roomDto.getIdRoom());
        roomEntity.setNumberOfBeds(roomDto.getNumberOfBeds());
        roomEntity.setPrice(roomEntity.getPrice());
        roomRepository.save(roomEntity);
    }
}
