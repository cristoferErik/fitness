package com.fitness.smart.db.exercises.entities;

import java.util.ArrayList;
import java.util.List;

import com.fitness.smart.db.workouts.entities.Workout;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="exercises")
public class Exercise {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String instructions;
    private String category;

    @ManyToMany(mappedBy="exercises")
    private List<Workout> workouts;

    public Exercise() {
        this.workouts=new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    
}
