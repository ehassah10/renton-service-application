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
