package com.uisrael.legalprosglpweb.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "notifications")
public class Notifications implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "legal_case_id", nullable = false) // Define la clave foránea
    private LegalCases legalCase;
    
    @Column(nullable = false, columnDefinition = "nvarchar(25)")
    private String type;
    @Column(nullable = false, columnDefinition = "nvarchar(255)")
    private String message;
    private Date dateSend;

}
