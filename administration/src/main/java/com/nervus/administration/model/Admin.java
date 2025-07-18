package com.nervus.administration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(schema = "admins", name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String admin_name;
    private String email;

    // Getters, setters, constructors
    public Admin() {}
    public Admin(String admin_name, String email) {
        this.admin_name = admin_name;
        this.email = email;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getAdmin_name() { return admin_name; }
    public void setAdmin_name(String admin_name) { this.admin_name = admin_name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}