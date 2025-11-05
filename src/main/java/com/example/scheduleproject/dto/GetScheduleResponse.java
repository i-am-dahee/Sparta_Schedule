package com.example.scheduleproject.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GetScheduleResponse {

    private final Long id;
    private final String title;
    private final String content;
    private final String name;
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;
    private final List<SimpleComment> comments;

    // 일정 선택 조회 (댓글 포함)
    public GetScheduleResponse(Long id, String title, String content, String name, LocalDateTime createdAt, LocalDateTime modifiedAt, List<SimpleComment> comments) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.name = name;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.comments = comments;
    }

    // 일정 전체 조회 (댓글 미포함)
    public GetScheduleResponse(Long id, String title, String content, String name,
                               LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this(id, title, content, name, createdAt, modifiedAt, List.of());
    }

}
