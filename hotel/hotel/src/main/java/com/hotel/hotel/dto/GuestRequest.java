package com.hotel.hotel.dto;

import lombok.Data;


import java.util.Date;

@Data
public class GuestRequest {

    private Integer idGuest;
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private String nationality;
    private String phone;

}