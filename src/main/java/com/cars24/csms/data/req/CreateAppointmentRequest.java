package com.cars24.csms.data.req;

import com.cars24.csms.data.enums.AppointmentStatus;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import javax.persistence.Column;
@Valid
@Data
public class CreateAppointmentRequest {
    @Valid
    @Min(value = 1, message = "Invalid customer ID")
    private int c_id;
    @Valid
    @Min(value = 1, message = "Invalid vehicle ID")
    private int v_id;
    @Valid
    @Min(value = 1, message = "Invalid service ID")
    private int s_id;
    @Valid
    @NotBlank
    private String a_date;
    private AppointmentStatus status;
}
