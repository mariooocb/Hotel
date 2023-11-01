package com.hotel.hotel.Controller;

import com.hotel.hotel.Dto.GuestDto;
import com.hotel.hotel.Dto.RoomDto;
import com.hotel.hotel.Service.GuestService;
import com.hotel.hotel.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    private void createRoom(@RequestBody RoomDto roomDto) {
        roomService.createRoom(roomDto);
    }
}
