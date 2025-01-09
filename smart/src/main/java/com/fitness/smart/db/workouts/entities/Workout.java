package com.fitness.smart.db.workouts.entities;

import java.util.ArrayList;
import java.util.List;

import com.fitness.smart.db.exercises.entities.Exercise;
import com.fitness.smart.db.workouts.enm.EnumWorkout;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="workouts")
public class Workout { 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String description;
    private EnumWorkout.EnumCategory category;

    @ManyToMany
    @JoinTable(
        name="workout_exercise",
        joinColumns=@JoinColumn(name="workout_id"),
        inverseJoinColumns=@JoinColumn(name="exercise_id")
    )
    private List<Exercise> exercises;

    public Workout() {
        this.exercises=new ArrayList<>();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnumWorkout.EnumCategory getCategory() {
        return category;
    }

    public void setCategory(EnumWorkout.EnumCategory category) {
        this.category = category;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    
}
