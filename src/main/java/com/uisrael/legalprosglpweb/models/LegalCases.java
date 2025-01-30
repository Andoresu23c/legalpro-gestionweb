package com.uisrael.legalprosglpweb.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class LegalCases implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Clients client;

    @Column(nullable = false, columnDefinition = "nvarchar(20)")
    private String caseType;
    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false, columnDefinition = "nvarchar(20)", unique = true)
    private String caseCode;

    @OneToMany(mappedBy = "legalCase", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LegalDeadline> legalDeadlines;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tasks> tasks;

    @OneToMany(mappedBy = "notifications", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Notifications> notifications;

}
