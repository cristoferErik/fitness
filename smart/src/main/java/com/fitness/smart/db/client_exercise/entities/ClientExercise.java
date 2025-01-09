package com.fitness.smart.db.client_exercise.entities;

import com.fitness.smart.db.client.entities.Client;
import com.fitness.smart.db.exercises.entities.Exercise;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="client_exercise")
public class ClientExercise {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private Long id;
    private int sets;
    private int repts;
    private int restSeconds;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name="exercise_id")
    private Exercise exercise;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getSets() {
        return sets;
    }
    public void setSets(int sets) {
        this.sets = sets;
    }
    public int getRepts() {
        return repts;
    }
    public void setRepts(int repts) {
        this.repts = repts;
    }
    public int getRestSeconds() {
        return restSeconds;
    }
    public void setRestSeconds(int restSeconds) {
        this.restSeconds = restSeconds;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Exercise getExercise() {
        return exercise;
    }
    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    

}
