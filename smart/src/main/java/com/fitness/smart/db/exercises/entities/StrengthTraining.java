package com.fitness.smart.db.exercises.entities;

import com.fitness.smart.db.exercises.enm.EnumExercise;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="strenght_training")
public class StrengthTraining extends  Exercise{
    private int sets;
    private int repetitions;
    private Double weight;     
    private EnumExercise.Muscle muscle;
    private EnumExercise.Category category;

    public EnumExercise.Muscle getMuscle() {
        return muscle;
    }
    public void setMuscle(EnumExercise.Muscle muscle) {
        this.muscle = muscle;
    }
    public EnumExercise.Category getCategory() {
        return category;
    }
    public void setCategory(EnumExercise.Category category) {
        this.category = category;
    }
    public int getSets() {
        return sets;
    }
    public void setSets(int sets) {
        this.sets = sets;
    }
    public int getRepetitions() {
        return repetitions;
    }
    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    
}
