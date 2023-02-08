package com.SpringProject.GoalTrackerBackend.repository;

import com.SpringProject.GoalTrackerBackend.model.GoalModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<GoalModel, Integer> {
}
