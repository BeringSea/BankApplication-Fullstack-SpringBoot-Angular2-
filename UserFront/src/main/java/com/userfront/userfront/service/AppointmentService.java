package com.userfront.userfront.service;

import com.userfront.userfront.domain.Appointment;

import java.util.List;

/**
 * @author David Mojicevic on 3/21/19.
 */
public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
