package com.cars24.csms.data.entities;

import com.cars24.csms.data.enums.AppointmentStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;



@Data
@Table(name = "appointments")
@Entity
public class AppointmentsEntity {
    @Id
    @Column(name = "appointment_id")
    private int appointment_id;

    @Column(name = "customer_id", nullable = false)
    private int customer_id;

    @Column(name = "vehicle_id", nullable = false)
    private int vehicle_id;

    @Column(name = "service_id", nullable = false)
    private int service_id;

    @Column(name = "appointment_date", nullable = false)
    private String appointment_date;

    @Column(nullable = false)
    private String status;

}
