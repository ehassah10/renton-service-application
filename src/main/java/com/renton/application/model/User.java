package com.renton.application.model;
import com.renton.application.utils.Enum;
import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "user")
public class User {
    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private long id;
    private String firstName;
    private String lastName;
    public String primaryEmail;
    public String secondaryEmail;
    public Address address;
    public String primaryPhone;
    public String secondaryPhone;
    public Enum.userType userType;
    public Date dateAdded;
    public Date dateModified;
    public String password;

    public User(long id, String firstName, String lastName, String primaryEmail, String secondaryEmail, Address address, String primaryPhone, String secondaryPhone, Enum.userType userType, Date dateAdded, Date dateModified, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.primaryEmail = primaryEmail;
        this.secondaryEmail = secondaryEmail;
        this.address = address;
        this.primaryPhone = primaryPhone;
        this.secondaryPhone = secondaryPhone;
        this.userType = userType;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
        this.password = password;
    }
    //testing commit
    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(com.renton.application.model.Address address) {
        address = address;
    }

    public Enum.userType getUserType() {
        return userType;
    }

    public void setUserType(Enum.userType userType) {
        userType = userType;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        dateAdded = dateAdded;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        dateModified = dateModified;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getSecondaryPhone() {
        return secondaryPhone;
    }

    public void setSecondaryPhone(String secondaryPhone) {
        this.secondaryPhone = secondaryPhone;
    }

}

