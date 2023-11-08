package com.hotel.hotel.repository;

import com.hotel.hotel.model.GuestEntity;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<GuestEntity, Integer> {
}