package com.example.planner.PlannerApp.repository;

import com.example.planner.PlannerApp.model.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends MongoRepository<Plan, String> {
}
