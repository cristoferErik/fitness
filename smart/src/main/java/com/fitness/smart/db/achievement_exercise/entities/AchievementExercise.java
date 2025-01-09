package com.fitness.smart.db.achievement_exercise.entities;

import com.fitness.smart.db.achievements.entities.Achievement;
import com.fitness.smart.db.workouts.entities.Workout;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="achievement_exercise")
public class AchievementExercise {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private Long id;

    private boolean completed=false;
    
    @ManyToOne
    @JoinColumn(name="achievement_id")
    private Achievement achievement;
    
    @ManyToOne
    @JoinColumn(name="workout_id")
    private Workout workout;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(Achievement achievement) {
        this.achievement = achievement;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    

}
