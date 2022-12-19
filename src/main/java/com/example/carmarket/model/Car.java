package com.example.carmarket.model;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Car implements Serializable {
    private long id;
    private String model;
    private String brand;
    private int yearOfRelease;
    private int odometer;
    private String transmission;
    private String fuel;
    private String bodyType;
}
