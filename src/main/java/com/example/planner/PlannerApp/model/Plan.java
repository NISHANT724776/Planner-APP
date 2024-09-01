package com.example.planner.PlannerApp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "plans")
public class Plan {
    @Id
    private String id;
    private String title;
    private List<Task> tasks;

    @Data
    public static class Task {
        private String date;  // format: YYYY-MM-DD
        private String note;
    }

}