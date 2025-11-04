package com.example.scheduleproject.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "schedules")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Long password;
    private String title;
    private String content;

    public Schedule(String name, Long password, String title, String content) {
        this.name = name;
        this.password = password;
        this.title = title;
        this.content = content;
    }

    public void update(String name, String title) {
        this.name = name;
        this.title = title;
    }
}