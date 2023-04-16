package com.Carservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Table(name = "order_table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int orderNumber;
    private LocalDateTime creationTime;
    private int idUser;
    private int idEmployee;
    private double price;
    private String carNumber;
    private String carBrand;
    private String carType;
    private String comments;
}
