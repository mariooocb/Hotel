package com.hotel.hotel.Repository;

import com.hotel.hotel.Model.GuestEntity;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<GuestEntity, Integer> {
}
