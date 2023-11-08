package com.hotel.hotel.controller;

import com.hotel.hotel.dto.GuestRequest;
import com.hotel.hotel.service.GuestService;
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
    private void createGuest(@RequestBody GuestRequest guestRequest) {
        guestService.createGuest(guestRequest);
    }
}