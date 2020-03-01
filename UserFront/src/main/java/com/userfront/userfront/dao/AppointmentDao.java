package com.userfront.userfront.dao;

import com.userfront.userfront.domain.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author David Mojicevic on 3/21/19.
 */
public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
