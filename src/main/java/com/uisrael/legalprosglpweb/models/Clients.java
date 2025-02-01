package com.uisrael.legalprosglpweb.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

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

    @OneToMany (mappedBy = "client", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private java.util.List<LegalCases> legalCases;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public java.util.List<LegalCases> getLegalCases() {
        return legalCases;
    }

    public void setLegalCases(java.util.List<LegalCases> legalCases) {
        this.legalCases = legalCases;
    }
}
