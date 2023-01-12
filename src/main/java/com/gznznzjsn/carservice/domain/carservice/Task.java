package com.gznznzjsn.carservice.domain.carservice;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Task {

    private Long id;
    private String name;
    private int duration;
    private BigDecimal costPerHour;
    private Specialization requiredSpecialization;

}
