package com.fitness.smart.db.achievements.entities;


import java.sql.Timestamp;

import com.fitness.smart.db.workouts.entities.Workout;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name="progress")
public class Achievement {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private Long id;
    
    private boolean completed=false;

    @ManyToOne
    @JoinColumn(name="workout_id")
    private Workout workout;

    @Column(name="create_at",nullable=false,updatable=false)
    private Timestamp createAt;

    @PrePersist
    public void prePersist(){
     this.createAt=new Timestamp(System.currentTimeMillis());
    }

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


    public Workout getWorkout() {
        return workout;
    }


    public void setWorkout(Workout workout) {
        this.workout = workout;
    }


    public Timestamp getCreateAt() {
        return createAt;
    }


    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }


}
