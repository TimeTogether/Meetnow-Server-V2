package com.pro.domain.schedule.domain;

import com.pro.base.common.BaseEntity;
import com.pro.domain.comment.domain.Comment;
import com.pro.oauth2.entity.User;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "t_mn_schedule")
public class Schedule extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "schedule_id")
  private Long id;

  @Column(name ="user_id")
  private Long userId;

  @Nullable
  private Long group_schedule_id;

  @NotBlank
  private ColorEnum color;

  @NotNull(message = "일정 시작시간은 필수값입니다.")
  private LocalDateTime start_time; //일정 시작시간 (yyyy-MM-ddTHH:mm:ss)

  @NotNull(message = "일정 종료시간은 필수값입니다.")
  private LocalDateTime end_time; //일정 종료시간

  @NotNull(message = "일정 제목은 필수값입니다.")
  private String title; //일정 제목
  
  @Nullable
  private String content; //일정 내용

  @Nullable
  private String place_name; //일정 장소 이름

  @Nullable
  private String place_url; //일정 장소 url


  //Builder, of
  @Builder
  public Schedule(Long id, Long userId, @Nullable Long group_schedule_id, ColorEnum color, LocalDateTime start_time, LocalDateTime end_time, String title, @Nullable String content, @Nullable String place_name, @Nullable String place_url) {
    this.id = id;
    this.userId = userId;
    this.group_schedule_id = group_schedule_id;
    this.color = color;
    this.start_time = start_time;
    this.end_time = end_time;
    this.title = title;
    this.content = content;
    this.place_name = place_name;
    this.place_url = place_url;
  }


}
