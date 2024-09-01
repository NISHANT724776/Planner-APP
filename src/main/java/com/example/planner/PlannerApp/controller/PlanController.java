package com.example.planner.PlannerApp.controller;

import com.example.planner.PlannerApp.model.Plan;
import com.example.planner.PlannerApp.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/plans")
@CrossOrigin(origins = "http://localhost:3000")
public class PlanController {
    @Autowired
    private PlanService planService;

    @GetMapping
    public List<Plan> getAllPlans() {
        return planService.getAllPlans();
    }

    @GetMapping("/{id}")
    public Optional<Plan> getPlanById(@PathVariable String id) {
        return planService.getPlanById(id);
    }

    @PostMapping
    public Plan createPlan(@RequestBody Plan plan) {
        return planService.createPlan(plan);
    }

    @DeleteMapping("/{id}")
    public void deletePlan(@PathVariable String id) {
        planService.deletePlan(id);
    }

    @PutMapping("/{id}")
    public Plan updatePlan(@PathVariable String id, @RequestBody Plan plan) {
        return planService.updatePlan(id, plan);
    }
}
