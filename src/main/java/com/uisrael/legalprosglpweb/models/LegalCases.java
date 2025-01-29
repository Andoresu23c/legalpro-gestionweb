package com.uisrael.legalprosglpweb.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class LegalCases implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, columnDefinition = "nvarchar(20)")
    private String caseType;
    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false, columnDefinition = "nvarchar(20)", unique = true)
    private String caseCode;

}
