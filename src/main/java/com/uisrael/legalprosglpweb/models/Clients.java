package com.uisrael.legalprosglpweb.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "clients")
public class Clients implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable=false, columnDefinition = "nvarchar(1)")
    private String documentType;
    @Column(nullable=false, columnDefinition = "nvarchar(15)")
    private String document;
    @Column(nullable=false, columnDefinition = "nvarchar(25)")
    private String name;
    @Column(nullable=false, columnDefinition = "nvarchar(25)")
    private String lastName;
    @Column(nullable=false, columnDefinition = "nvarchar(30)")
    private String email;
    @Column(nullable=false, columnDefinition = "nvarchar(10)")
    private String phone;
}
