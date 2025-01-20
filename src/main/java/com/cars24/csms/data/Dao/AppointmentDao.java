package com.cars24.csms.data.Dao;

import com.cars24.csms.data.req.CreateAppointmentRequest;
import com.cars24.csms.data.res.CreateAppointmentResponse;
import org.springframework.stereotype.Service;

@Service
public interface AppointmentDao {
    int createAppointment(CreateAppointmentRequest createAppointmentRequest);
}
