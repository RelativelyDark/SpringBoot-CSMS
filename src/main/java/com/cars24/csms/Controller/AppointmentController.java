package com.cars24.csms.Controller;

import com.cars24.csms.Services.AppointmentService;
import com.cars24.csms.Services.Impl.AppointmentServiceImpl;
import com.cars24.csms.data.req.CreateAppointmentRequest;
import com.cars24.csms.data.res.CreateAppointmentResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/appointments")
@Slf4j
@Validated
@Valid
@RequiredArgsConstructor
@Service
public class AppointmentController {

    private final AppointmentServiceImpl appointmentServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<CreateAppointmentResponse> createAppointment(@Valid @RequestBody CreateAppointmentRequest createAppointmentRequest){
        log.info("[createAppointment] createAppointmentRequest {}", createAppointmentRequest);
        CreateAppointmentResponse createAppointmentResponse = new CreateAppointmentResponse();

        appointmentServiceImpl.CreateAppointmentResponse(createAppointmentRequest);

        return ResponseEntity.ok().body(createAppointmentResponse);
    }
}
