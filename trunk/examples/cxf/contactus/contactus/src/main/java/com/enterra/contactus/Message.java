package com.enterra.contactus;

import org.apache.cxf.aegis.type.java5.IgnoreProperty;

public class Message {
    private String firstName;
    private String lastName;
    private String email;
    private String text;

    public Message() {
        
    }
    public Message(String firstName, String lastName, String email, String text) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.text = text;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @IgnoreProperty
    public String getLastNameFirstName() {
        return lastName + ", " + firstName;
    }

    @Override
    public String toString() {
        return "Message from " + getLastNameFirstName() + ": \"" + getText() + "\""; 
    }
}
