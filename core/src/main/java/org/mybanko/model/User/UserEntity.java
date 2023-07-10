package org.mybanko.model.User;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tbl_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "username")
    String username;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @Column(name = "givenname")
    String givenname;

    @Column(name = "surname")
    String surname;

    @Column(name = "second_surname")
    String secondSurname;

    @Column(name = "gender")
    short gender;

    @Column(name = "birthday")
    Date birthday;

    @Column(name = "identify_document_type")
    short identifyDocumentType;

    @Column(name = "identify_document_number")
    String identifyDocumentNumber;

    @Column(name = "create_time")
    Date createTime;

    @Column(name = "role")
    short role;

    @Column(name = "iban")
    String iban;

    @Column(name = "bic")
    String bic;

    @Column(name = "status")
    short status;

    @Column(name = "profile_image_url")
    String profileImageUrl;


    /*
    getter, setter
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGivenname() {
        return givenname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public short getGender() {
        return gender;
    }

    public void setGender(short gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public short getIdentifyDocumentType() {
        return identifyDocumentType;
    }

    public void setIdentifyDocumentType(short identifyDocumentType) {
        this.identifyDocumentType = identifyDocumentType;
    }

    public String getIdentifyDocumentNumber() {
        return identifyDocumentNumber;
    }

    public void setIdentifyDocumentNumber(String identifyDocumentNumber) {
        this.identifyDocumentNumber = identifyDocumentNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public short getRole() {
        return role;
    }

    public void setRole(short role) {
        this.role = role;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
