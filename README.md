# 📆 Schedule & Comment Management Project
> Spring Boot + JPA 기반 일정 관리 & 댓글 기능 CRUD 프로젝트

## ✅ 프로젝트 소개
사용자가 일정(Schedule)을 등록하고, 각 일정에 댓글(Comment)을 작성할 수 있는 REST API 서버입니다.  
일정과 댓글을 생성/조회/수정/삭제할 수 있으며, 비밀번호 검증을 통해 수정/삭제 권한을 관리합니다.
> API 명세서
> https://documenter.getpostman.com/view/47562339/2sB3WquKz7
<img width="1048" height="572" alt="schedule" src="https://github.com/user-attachments/assets/f1781112-8a40-4df6-b5a0-3c71e498931a" />


## ✨ 주요 기능
|기능|설명|
|------|-----|
|일정 생성|제목, 내용, 작성자, 비밀번호 입력 후 일정 생성|
|전체 일정 조회|작성자 이름 기준으로 일정 조회 (최신순 정렬)|
|단일 일정 조회|해당 일정의 댓글 목록 포함 일정 상세 조회|
|일정 수정|비밀번호 일치 시 제목, 작성자 이름 수정 허용|
|일정 삭제|비밀번호 일치 시 삭제 허용|
|댓글 생성|특정 일정에 댓글 작성|
|댓글 수정|비밀번호 일치 시 내용 수정 허용|
|댓글 삭제|비밀번호 일치 시 삭제 허용|

## 🛠️ 기술 스택
| 구분 | 기술 |
|------|------|
| Backend | Spring Boot 3.5.7, Spring Web, Spring Validation |
| ORM / JPA | Spring Data JPA |
| DB | MySQL |
| 개발 편의 | Lombok, Postman |
| 빌드/관리 | Gradle |

## 📂 프로젝트 구조
```
src/main/java/com/example/schedule
│
├─ controller
│    ├─ ScheduleController.java
│    └─ CommentController.java
│
├─ dto
│    ├─ CreateScheduleRequest.java
│    ├─ CreateScheduleResponse.java
│    ├─ CreateCommentRequest.java
│    ├─ CreateCommentResponse.java
│    ├─ UpdateScheduleRequest.java
│    ├─ UpdateScheduleResponse.java
│    ├─ UpdateCommentRequest.java
│    ├─ UpdateCommentResponse.java
│    ├─ DeleteScheduleRequest.java
│    ├─ DeleteCommentRequest.java
│    ├─ GetScheduleResponse.java
│    └─ SimpleComment.java
│
├─ entity
│    ├─ BaseEntity.java
│    ├─ Schedule.java
│    └─ Comment.java
│
├─ repository
│    ├─ ScheduleRepository.java
│    └─ CommentRepository.java
│
└─ service
     ├─ ScheduleService.java
     └─ CommentService.java
```
