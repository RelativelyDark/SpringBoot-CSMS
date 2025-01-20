package com.cars24.csms.Services.Impl;

import com.cars24.csms.Services.AppointmentService;
import com.cars24.csms.data.Dao.AppointmentDao;
import com.cars24.csms.data.Dao.Impl.AppointmentDaoImpl;
import com.cars24.csms.data.req.CreateAppointmentRequest;
import com.cars24.csms.data.res.CreateAppointmentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AppointmentServiceImpl implements AppointmentService {

    final private AppointmentDaoImpl appointmentDao;

    @Override
    public CreateAppointmentResponse CreateAppointmentResponse(CreateAppointmentRequest createAppointmentRequest) {
        appointmentDao.createAppointment(createAppointmentRequest);
        return null;
    }
}
