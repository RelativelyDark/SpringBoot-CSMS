package com.cars24.csms.Services;

import com.cars24.csms.data.req.CreateAppointmentRequest;
import com.cars24.csms.data.res.CreateAppointmentResponse;
import org.springframework.stereotype.Service;

@Service
public interface AppointmentService {
    public CreateAppointmentResponse CreateAppointmentResponse(CreateAppointmentRequest createAppointmentRequest);
}
