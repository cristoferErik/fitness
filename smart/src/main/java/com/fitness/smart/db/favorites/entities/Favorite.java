package com.fitness.smart.db.favorites.entities;

import java.util.ArrayList;
import java.util.List;

import com.fitness.smart.db.workouts.entities.Workout;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="favorites")
public class Favorite {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private Long id;

    @ManyToMany
    @JoinTable(
        name="favorite_workout",
        joinColumns=@JoinColumn(name="favorite_id"),
        inverseJoinColumns=@JoinColumn(name="workout_id")
    )
    private List<Workout> workouts;

    public Favorite() {
        this.workouts=new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }

    

}
