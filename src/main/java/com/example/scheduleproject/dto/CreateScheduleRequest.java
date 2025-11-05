package com.example.scheduleproject.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CreateScheduleRequest {

    @NotBlank(message = "일정 제목을 입력해 주세요.")
    @Size(max = 30, message = "일정 제목은 최대 30자 이내여야 합니다.")
    private String title;

    @NotBlank(message = "일정 내용을 입력해 주세요.")
    @Size(max = 200, message = "일정 내용은 최대 200자 이내여야 합니다.")
    private String content;

    @NotBlank(message = "작성자명을 입력해 주세요.")
    private String name;

    @NotBlank(message = "비밀번호를 입력해 주세요.")
    private String password;
}
