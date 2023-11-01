package com.hotel.hotel.Dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class RoomDto {
    private int idRoom;
    private int numberOfBeds;
    private int price;
}
