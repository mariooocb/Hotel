package com.hotel.hotel.Controller;

import com.hotel.hotel.Dto.GuestDto;
import com.hotel.hotel.Service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guests")
public class GuestController {
    @Autowired
    private GuestService guestService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    private void createGuest(@RequestBody GuestDto guestDto) {
        guestService.createGuest(guestDto);
    }
}
