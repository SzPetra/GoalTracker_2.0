package com.SpringProject.GoalTrackerBackend.model;

import jakarta.persistence.*;
import lombok.*;

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

    @OneToMany(cascade = CascadeType.ALL)
    private List<ActionModel> actions;
    private boolean isPrivate;

}
