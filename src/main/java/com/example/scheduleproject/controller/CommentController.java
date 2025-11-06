package com.example.scheduleproject.controller;

import com.example.scheduleproject.dto.*;
import com.example.scheduleproject.service.CommentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    // 댓글 생성
    @PostMapping("/schedules/{scheduleId}/comments")
    public ResponseEntity<CreateCommentResponse> createComment(
            @PathVariable Long scheduleId,
            @RequestBody @Valid CreateCommentRequest request) {
        CreateCommentResponse result = commentService.save(scheduleId, request);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    // 댓글 수정
    @PutMapping("/comments/{commentId}")
    public ResponseEntity<UpdateCommentResponse> updateComment(
            @PathVariable Long commentId,
            @RequestBody @Valid UpdateCommentRequest request) {
        UpdateCommentResponse result = commentService.update(commentId, request);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    // 댓글 삭제
    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<Void> deleteComment(
            @PathVariable Long commentId,
            @RequestBody @Valid DeleteCommentRequest request) {
        commentService.delete(commentId, request.getPassword());
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
