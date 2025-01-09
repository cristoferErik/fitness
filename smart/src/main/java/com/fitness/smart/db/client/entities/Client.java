package com.fitness.smart.db.client.entities;

import java.util.ArrayList;
import java.util.List;

import com.fitness.smart.db.achievements.entities.Achievement;
import com.fitness.smart.db.client.enm.EnumClient.EnumGender;
import com.fitness.smart.db.favorites.entities.Favorite;
import com.fitness.smart.db.schedule.entities.Schedule;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="clients")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String password;
    private int age;

    @Enumerated(EnumType.STRING)
    private EnumGender Gender;

    @OneToMany
    @JoinColumn(name="client_id")
    private List<Schedule> schedules;
    
    @OneToMany
    @JoinColumn(name="client_id")
    private List<Achievement> achievements;

    @OneToOne
    @JoinColumn(name="client_id")
    private Favorite favorite;

    public Client() {
        this.schedules=new ArrayList<>();
        this.achievements= new ArrayList<>();
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EnumGender getGender() {
        return Gender;
    }

    public void setGender(EnumGender gender) {
        Gender = gender;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public Favorite getFavorite() {
        return favorite;
    }

    public void setFavorite(Favorite favorite) {
        this.favorite = favorite;
    }

    
}
