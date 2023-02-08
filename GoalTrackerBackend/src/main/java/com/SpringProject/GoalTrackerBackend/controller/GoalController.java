package com.SpringProject.GoalTrackerBackend.controller;

import com.SpringProject.GoalTrackerBackend.model.GoalModel;
import com.SpringProject.GoalTrackerBackend.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("goal")
@RestController
public class GoalController {

    private final GoalService goalService;

    @Autowired
    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping
    public List<GoalModel> getAllGoals() {
        return goalService.getAllGoals();
    }

    @PostMapping
    @ResponseBody
    public void addNewGoal(@RequestBody GoalModel goal) {
        goalService.addNewGoal(goal);
    }

    @DeleteMapping(value = "{id}")
    public void deleteGoalById(@PathVariable int id) {
        goalService.deleteGoalById(id);
    }
}
