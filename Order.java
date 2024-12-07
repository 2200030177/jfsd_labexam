package com.klef.jfsd.exam.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders") // This maps the entity to the 'orders' table in the database
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment for primary key
    private Long orderId;

    @Column(name = "product_name", nullable = false) // Maps this field to a column in the table
    private String productName;

    @Column(nullable = false)
    private int quantity;

    @Temporal(TemporalType.DATE) // Maps the field as a date type
    private Date orderDate;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    // Getters and setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
