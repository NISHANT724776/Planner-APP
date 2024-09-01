package com.example.planner.PlannerApp.service;

import com.example.planner.PlannerApp.model.Plan;
import com.example.planner.PlannerApp.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanService {
    @Autowired
    private PlanRepository planRepository;

    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    public Optional<Plan> getPlanById(String id) {
        return planRepository.findById(id);
    }

    public Plan createPlan(Plan plan) {
        return planRepository.save(plan);
    }

    public void deletePlan(String id) {
        planRepository.deleteById(id);
    }

    public Plan updatePlan(String id, Plan plan) {
        if (planRepository.existsById(id)) {
            plan.setId(id);
            return planRepository.save(plan);
        }
        return null;
    }
}
