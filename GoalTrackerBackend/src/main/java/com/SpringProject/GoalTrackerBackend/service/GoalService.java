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
    
    public void updateExistingGoal (int oldId, GoalModel updatedGoal) {
        GoalModel existingGoal = goalRepository.findById(oldId)
                .orElse(null);

        //updating the title if not null
        if(updatedGoal.getTitle() != null){
            existingGoal.setTitle(updatedGoal.getTitle());
        }
        //updating the description if not null
        if(updatedGoal.getDescription() != null) {
            existingGoal.setDescription(updatedGoal.getDescription());
        }
        
        goalRepository.save(existingGoal);
    }
}
