package com.example.task;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String email;
    private String firstname;
    private String lastname;
    private String 

    public String getName() {
        return name;
    }

    public String getPhonecode() {
        return phonecode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhonecode(String phonecode) {
        this.phonecode = phonecode;
    }
}
