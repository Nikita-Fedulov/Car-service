package com.Carservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="order_service")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int servicesId;
    private int orderId;
}
