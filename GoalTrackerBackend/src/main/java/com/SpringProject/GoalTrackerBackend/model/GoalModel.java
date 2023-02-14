package com.SpringProject.GoalTrackerBackend.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String description;
    private LocalDate date;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ActionModel> actions;

    @Column(columnDefinition = "boolean default false")
    private boolean availableToPublic;

    @PrePersist
    void atPersist() {
        date = LocalDate.now();
    }
}
