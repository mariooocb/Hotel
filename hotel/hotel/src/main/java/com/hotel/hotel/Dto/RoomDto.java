package com.hotel.hotel.Dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class RoomDto {
    private long idRoom;
    private int numberOfBeds;
    private float price;
    private String description;
}
