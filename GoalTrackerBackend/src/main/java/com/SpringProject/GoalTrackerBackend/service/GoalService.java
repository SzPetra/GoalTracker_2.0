package com.SpringProject.GoalTrackerBackend.service;

import com.SpringProject.GoalTrackerBackend.model.GoalModel;
import com.SpringProject.GoalTrackerBackend.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoalService {
    private final GoalRepository goalRepository;

    @Autowired
    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public List<GoalModel> getAllGoals() {
        return goalRepository.findAll();
    }

    public void addNewGoal(GoalModel goal) {
        goalRepository.save(goal);
    }

    public void deleteGoalById(int goalId) {
        goalRepository.deleteById(goalId);
    }

    public void updateExistingGoal(GoalModel goal) {
        goalRepository.save(goal);
    }

    public GoalModel getGoalById (int id) {
        return goalRepository.findById(id)
                .orElse(null);
    }
}
