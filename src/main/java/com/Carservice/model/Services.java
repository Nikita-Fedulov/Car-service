package com.Carservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Table(name = "services")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="serviceName")
    private String serviceName;
    @Column(name="servicePrice")
    private int servicePrice;
    private double carPrice;
    @Column(name="time")
    private String time;
    @Column(name="carType")
    private String carType;
}
