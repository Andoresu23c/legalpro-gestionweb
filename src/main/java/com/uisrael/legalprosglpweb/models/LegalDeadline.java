package com.uisrael.legalprosglpweb.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
public class LegalDeadline implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "legal_case_id", nullable = false) // Define la clave foránea
    private LegalCases legalCase;
    
    @Column(columnDefinition = "nvarchar(255)")
    private String description;
    private Date endDate;
    @Column(columnDefinition = "nvarchar(30)")
    private String status;
}
