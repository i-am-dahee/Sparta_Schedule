package com.example.scheduleproject.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class CreateCommentRequest {

    @NotBlank(message = "댓글 내용을 입력해 주세요.")
    @Size(max = 100, message = "댓글 내용은 최대 100자 이내여야 합니다.")
    private String content;

    @NotBlank(message = "작성자명을 입력해 주세요.")
    private String name;

    @NotBlank(message = "비밀번호를 입력해 주세요.")
    private String password;
}
