package com.killoran.week1;

/**
 * Created by 114596 on 2/19/2019.
 */
import java.util.*;


public class Person {
    private String Name;
    private String emailAddress;

    public Person(String name, String emailAddress) {
        Name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return
                "Name: " + Name +
                        ", Email" + emailAddress +
                        '}';
    }
}
