package com.hotel.hotel.Dto;

import lombok.Data;


import java.util.Date;

@Data
public class GuestDto {

    private Integer idGuests;
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private String nationality;
    private String phone;

}
