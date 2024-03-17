package com.train.domen.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long order_id;
    @Column(name = "customer_id")
    private long customerId;
    @Column(name = "order_details")
    private String orderDetails;
    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", customerId=" + customerId +
                ", orderDetails='" + orderDetails + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
