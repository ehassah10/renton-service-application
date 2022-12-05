package com.renton.application.model;
import com.renton.application.utils.Enum;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
    @NotBlank(message = "First name is blank")
    @Size(max = 20)
    private String firstName;
    @NotBlank(message = "Last name is blank")
    @Size(max = 50)
    private String lastName;
    @NotBlank(message = "Primary email is blank")
    @Size(max = 50)
    @Email
    public String primaryEmail;

    @Email
    public String secondaryEmail;
    public Address address;
    @NotBlank(message = "Primary phone number is blank")
    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", message = "primary phone format")
    public String primaryPhone;

    @Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$", message = "Incorrect sec phone number")
    public String secondaryPhone;
    @NotBlank
    public Enum.userType userType;
    public Date dateAdded;
    public Date dateModified;
    @NotBlank
    @Size(max = 120)
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

