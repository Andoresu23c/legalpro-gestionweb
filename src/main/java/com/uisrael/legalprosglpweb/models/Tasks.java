package com.uisrael.legalprosglpweb.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "tasks")
public class Tasks implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "legal_case_id", nullable = false) // Define la clave foránea
    private LegalCases legalCase;
    
    @Column(nullable = true, columnDefinition = "nvarchar(255)")
    private String description;
    private Date deadline;
    @Column(nullable = true, columnDefinition = "nvarchar(10)")
    private String priority;
    @Column(nullable = true, columnDefinition = "nvarchar(10)")
    private String status;
    @Column(nullable = true, columnDefinition = "nvarchar(250)")
    private String evidence; 
}
