package com.hotel.hotel.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "room")
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_room")
    private int idRoom;
    @Column(name = "number_of_beds")
    private int numberOfBeds;
    @Column(name = "price")
    private int price;
}
