package com.example.scheduleproject.dto;

import lombok.Getter;

@Getter
public class CreateScheduleRequest {

    private String title;
    private String content;
    private String name;
    private Long password;
}
