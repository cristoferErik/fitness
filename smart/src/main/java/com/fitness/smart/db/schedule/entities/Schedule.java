package com.fitness.smart.db.schedule.entities;

import java.time.LocalTime;

import com.fitness.smart.db.schedule.enm.EnumSchedule;
import com.fitness.smart.db.workouts.entities.Workout;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private Long id;

    @Enumerated(EnumType.STRING)
    private EnumSchedule.EnumDay day;

    private LocalTime hourIni;
    private LocalTime hourEnd;

    @ManyToOne
    @JoinColumn(name="workout_id")
    private Workout workout;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumSchedule.EnumDay getDay() {
        return day;
    }

    public void setDay(EnumSchedule.EnumDay day) {
        this.day = day;
    }

    public LocalTime getHourIni() {
        return hourIni;
    }

    public void setHourIni(LocalTime hourIni) {
        this.hourIni = hourIni;
    }

    public LocalTime getHourEnd() {
        return hourEnd;
    }

    public void setHourEnd(LocalTime hourEnd) {
        this.hourEnd = hourEnd;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
    
}
