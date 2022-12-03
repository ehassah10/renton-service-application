package com.renton.application.model;

import com.renton.application.utils.Enum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
public class Item {

    @Transient
    public static final String SEQUENCE_NAME = "order_item_sequence";

    public Item(long id, String name, String descriptiom, int quantity, String latitude, String longitude, int addedBy, double price, Enum.orderItemStatus status, Date startDate, Date endDate) {
        this.id = id;
        this.name = name;
        this.descriptiom = descriptiom;
        this.quantity = quantity;
        this.latitude = latitude;
        this.longitude = longitude;
        this.addedBy = addedBy;
        this.price = price;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Id
    private long id;
    private String name;
    private String descriptiom;
    private int quantity;
    private String latitude;
    private String longitude;
    private int addedBy;
    private double price;
    private Enum.orderItemStatus status;
    private Date startDate;
    private Date endDate;
}
