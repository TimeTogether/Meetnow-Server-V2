package com.pro.domain.date.domain;

import com.pro.domain.group_meeting_middle.domain.GroupMeetingMiddle;
import com.pro.domain.meeting.domain.Meeting;
import com.pro.domain.time.domain.Time;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.sql.results.graph.Fetch;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "t_mn_date")
public class Date {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "date_id")
  private Long id;

  @NotNull(message = "그룹 회의 중간 테이블 아이디는 필수값입니다.")
  private Long groupMeetingMiddleId;

  @NotNull(message = "일(날짜)은 필수값입니다.")
  private LocalDate date;

  @NotNull(message = "요일값은 필수값입니다.")
  private String day;

  //Builder, of
  @Builder
  private Date(Long groupMeetingMiddleId, LocalDate date, String day) {
    this.groupMeetingMiddleId = groupMeetingMiddleId;
    this.date = date;
    this.day = day;
  }


}