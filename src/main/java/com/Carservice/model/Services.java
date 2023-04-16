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
    private String serviceName;
    private int servicePrice;
    private double carPrice;
    private String time;
    private String carType;
}
