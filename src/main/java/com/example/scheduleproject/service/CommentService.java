package com.example.scheduleproject.service;

import com.example.scheduleproject.dto.CreateCommentRequest;
import com.example.scheduleproject.dto.CreateCommentResponse;
import com.example.scheduleproject.entity.Comment;
import com.example.scheduleproject.entity.Schedule;
import com.example.scheduleproject.repository.CommentRepository;
import com.example.scheduleproject.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final ScheduleRepository scheduleRepository;

    @Transactional
    public CreateCommentResponse save(Long scheduleId, CreateCommentRequest request) {
        Schedule schedule = scheduleRepository.findById(scheduleId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 일정입니다."));

        Comment comment = new Comment(
                request.getContent(),
                request.getName(),
                request.getPassword(),
                schedule
        );
        Comment savedComment = commentRepository.save(comment);
        return new CreateCommentResponse(
                savedComment.getId(),
                savedComment.getContent(),
                savedComment.getName(),
                savedComment.getSchedule().getId(),
                savedComment.getCreatedAt(),
                savedComment.getModifiedAt()
        );
    }
}
