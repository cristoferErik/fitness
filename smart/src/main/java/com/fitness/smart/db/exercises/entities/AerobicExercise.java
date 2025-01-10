package com.fitness.smart.db.exercises.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="aerobic_exercises")
public class AerobicExercise extends Exercise{
    private int sets;
    private int duration;

    public int getSets() {
        return sets;
    }
    public void setSets(int sets) {
        this.sets = sets;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    
}
