package com.renton.application.model;

import com.renton.application.utils.Enum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document(collection = "order")
public class Order {
    @Transient
    public static final String SEQUENCE_NAME = "order_sequence";

    public Order(int orderedBy, int orderedTo, Item[] orderItems, Double totalPrice, Enum.orderStatus status, Date dateAdded, Date dateModified) {
        this.orderedBy = orderedBy;
        this.orderedTo = orderedTo;
        this.orderItems = orderItems;
        this.totalPrice = totalPrice;
        this.status = status;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    @Id
    public long id;
    public int orderedBy;
    public int orderedTo;
    public Item[] orderItems;
    public Double totalPrice;
    public Enum.orderStatus status;
    public Date dateAdded;
    public Date dateModified;
}
