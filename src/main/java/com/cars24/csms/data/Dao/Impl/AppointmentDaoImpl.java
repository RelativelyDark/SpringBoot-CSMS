package com.cars24.csms.data.Dao.Impl;

import com.cars24.csms.data.Dao.AppointmentDao;
import com.cars24.csms.data.entities.AppointmentsEntity;
import com.cars24.csms.data.repositories.AppointmentRepository;
import com.cars24.csms.data.req.CreateAppointmentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AppointmentDaoImpl implements AppointmentDao {

    private final AppointmentRepository appointmentRepository;

    @Override
    public int createAppointment(CreateAppointmentRequest createAppointmentRequest) {
        // SAVE - Nothing but ur insert query
        AppointmentsEntity appointmentsEntity = new AppointmentsEntity();
        appointmentsEntity.setCustomer_id(createAppointmentRequest.getC_id());
        appointmentsEntity.setStatus(createAppointmentRequest.getStatus().toString());
        appointmentsEntity.setVehicle_id(createAppointmentRequest.getV_id());
        appointmentsEntity.setAppointment_date(createAppointmentRequest.getA_date());
        appointmentsEntity.setService_id(createAppointmentRequest.getS_id());
        appointmentRepository.save(appointmentsEntity);
        return 0;
    }
}
