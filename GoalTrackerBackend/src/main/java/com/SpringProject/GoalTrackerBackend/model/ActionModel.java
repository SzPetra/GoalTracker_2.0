package com.SpringProject.GoalTrackerBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String action;
}
